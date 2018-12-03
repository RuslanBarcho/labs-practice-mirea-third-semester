package ru.mirea.lab.fourth;

public class Keyboard implements Priceable {
    String type;
    double price;
    String material;

    public Keyboard(String type, double price, String material) {
        this.type = type;
        this.price = price;
        this.material = material;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
