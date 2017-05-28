package org.launchcode.java.studios.restaurant;

/**
 * Created by msroc on 5/28/2017.
 */
public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String MenuItemToString() {
        return "Description: " + this.description + " Price: " + this.price + " Category: " + this.category + " New: " + this.isNew;
    }

    public static void main(String[] args) {
        //Doing this on Thursday
    }
}
