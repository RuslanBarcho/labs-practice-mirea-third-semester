package ru.mirea.lab.third;

public abstract class Furniture {

    private int height;
    private int width;
    private String material;
    private String color;
    private String name;
    private int cost;

    public Furniture(String name, int height, int width, String material, String color, int cost) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.material = material;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public abstract void displayMainInfo();
}
