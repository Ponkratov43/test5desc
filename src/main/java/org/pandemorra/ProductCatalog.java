package org.pandemorra;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductCatalog {

    private ObservableList<Product> products;
    private ListProperty<Product> productsProperty;
    private SimpleObjectProperty<Product> selectedProduct;

    public ProductCatalog() {
        this.products = FXCollections.observableArrayList();
        this.productsProperty = new SimpleListProperty<>(products);
        this.selectedProduct = new SimpleObjectProperty<>(null);
    }

    public ObservableList<Product> getProducts() {
        return productsProperty.get();
    }

    public ListProperty<Product> productsProperty() {
        return productsProperty;
    }

    public Product getSelectedProduct() {
        return selectedProduct.get();
    }

    public SimpleObjectProperty<Product> selectedProductProperty() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct.set(selectedProduct);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        if (selectedProduct.get() == product) {
            selectedProduct.set(null);
        }
    }

    public Product getProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
