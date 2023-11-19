package org.pandemorra;

public class Product {
    private static int idCounter = 0;

    private int id;
    private String name;
    private String category;
    private String action;
    private String photo;
    private String sourceLink;
    private boolean availability;
    private double price;
    private String description;

    public Product(String name, String category, String action, String photo,
                   String sourceLink, boolean availability, double price, String description) {
        this.id = ++idCounter;
        this.name = name;
        this.category = category;
        this.action = action;
        this.photo = photo;
        this.sourceLink = sourceLink;
        this.availability = availability;
        this.price = price;
        this.description = description;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getAction() {
        return action;
    }

    public String getPhoto() {
        return photo;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public boolean isAvailability() {
        return availability;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
