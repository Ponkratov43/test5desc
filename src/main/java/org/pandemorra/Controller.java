package org.pandemorra;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Controller {

    @FXML
    private ListView<Product> productListView;

    @FXML
    private Button addButton;

    @FXML
    private Button editButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button exportButton;

    private ProductCatalog catalog;

    public Controller() {
        this.catalog = new ProductCatalog();
    }

    @FXML
    private void initialize() {
        productListView.setItems(catalog.productsProperty());

        addButton.setOnAction(event -> handleAddProduct());
        editButton.setOnAction(event -> handleEditProduct());
        deleteButton.setOnAction(event -> handleDeleteProduct());
        exportButton.setOnAction(event -> handleExportToExcel());
    }

    @FXML
    private void handleAddProduct() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Add Product");
        dialog.setHeaderText(null);
        dialog.setContentText("Enter product name:");

        Optional<String> result = dialog.showAndWait();
        result.ifPresent(name -> {
            Product product = new Product("ID", "PhotoURL", "SourceURL", name, true, 123.45, "Description", "Category", "Action");
            catalog.addProduct(product);
        });
    }

    @FXML
    private void handleEditProduct() {
        Product selectedProduct = productListView.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            TextInputDialog dialog = new TextInputDialog(selectedProduct.getName());
            dialog.setTitle("Edit Product");
            dialog.setHeaderText(null);
            dialog.setContentText("Enter new product name:");

            Optional<String> result = dialog.showAndWait();
            result.ifPresent(selectedProduct::setName);
        } else {
            showAlert("Error", "Please select a product to edit.");
        }
    }

    @FXML
    private void handleDeleteProduct() {
        Product selectedProduct = productListView.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            catalog.removeProduct(selectedProduct);
        } else {
            showAlert("Error", "Please select a product to delete.");
        }
    }

    @FXML
    private void handleExportToExcel() {
        ExcelExporter exporter = new ExcelExporter();
        exporter.exportToExcel(catalog.getProducts(), "product_catalog.xlsx");
        showAlert("Export Successful", "Data exported to Excel successfully!");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
