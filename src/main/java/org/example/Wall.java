package org.example;

public class Wall {
    // Instance variables
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        // Set methods used to apply the same validation logic
        setWidth(width);
        setHeight(height);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }}