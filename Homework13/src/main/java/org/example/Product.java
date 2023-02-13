package org.example;

import java.time.LocalDate;

public class Product {
    private String category;
    private double price;
    private boolean isDiscountable;
    private LocalDate localDate;

    public Product(String category, double price, boolean isDiscountable, LocalDate localDate) {
        this.category = category;
        this.price = price;
        this.isDiscountable = isDiscountable;
        this.localDate = localDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscountable() {
        return isDiscountable;
    }

    public void setDiscountable(boolean discountable) {
        isDiscountable = discountable;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    @Override
    public String toString() {
        return "Product { " +
                "type='" + category + '\'' +
                ", price=" + price +
                ", isDiscountable=" + isDiscountable +
                ", localDate=" + localDate +
                " }";
    }


}
