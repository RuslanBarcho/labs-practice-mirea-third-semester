package ru.mirea.lab.fourth;

public class Monitor implements Priceable{
    String vendor;
    double price;
    int diagonal;

    public Monitor(String vendor, int price, int diagonal) {
        this.vendor = vendor;
        this.price = price;
        this.diagonal = diagonal;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
