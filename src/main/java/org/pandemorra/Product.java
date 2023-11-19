package org.pandemorra;

public class Product {
    private String id;
    private String photoUrl;
    private String sourceUrl;
    private String name;
    private boolean availability;
    private double price;
    private String description;
    private String category;
    private String action;

    public Product(String id, String photoUrl, String sourceUrl, String name, boolean availability, double price, String description, String category, String action) {
        this.id = id;
        this.photoUrl = photoUrl;
        this.sourceUrl = sourceUrl;
        this.name = name;
        this.availability = availability;
        this.price = price;
        this.description = description;
        this.category = category;
        this.action = action;
    }

    // Геттеры и сеттеры для остальных полей

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
