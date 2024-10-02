package com.pluralsight;

public class Donut {
    private String description;
    private int calories;
    private double price;

    public Donut(String description, int calories, double price) {
        this.description = description;
        this.calories = calories;
        this.price = price;
    }
    // getters
    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    // to connect strings together using the string builder
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(description);
        sb.append(" has ").append(calories);
        sb.append(" calories ");
        sb.append(" it cost ");
        sb.append(price);
        return sb.toString();


    }
}

