package com.ecommerce.Qkart.entities;

public enum ProductCategoryEnum {
    ELECTRONICS("Electronics"),
    BOOKS("Books"),
    CLOTHING("Clothing"),
    BEAUTY("Beauty"),
    HOME("Home"),
    SPORTS("Sports"),
    TOYS("Toys"),
    OTHER("Other");

    private final String category;

    ProductCategoryEnum(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}
