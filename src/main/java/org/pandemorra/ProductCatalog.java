package org.pandemorra;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductCatalog {
    private ObservableList<Product> products;

    public ProductCatalog() {
        this.products = FXCollections.observableArrayList();
    }

    public ObservableList<Product> productsProperty() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ObservableList<Product> getProducts() {
        return products;
    }
}
