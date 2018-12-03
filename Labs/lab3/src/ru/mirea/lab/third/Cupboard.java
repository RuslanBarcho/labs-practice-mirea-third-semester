package ru.mirea.lab.third;

public class Cupboard extends Furniture {

    boolean stateOpen = false;

    private int shelfAmount;

    public Cupboard(int height, int width, String material, String color, int cost, int shelfAmount) {
        super("Шкаф", height, width, material, color, cost);
        this.shelfAmount = shelfAmount;
    }

    public void open(boolean state){
        if (state){
            if (!stateOpen) System.out.println("шкаф открыт");
        } else {
            if (stateOpen) System.out.println("шкаф закрыт");
        }
    }

    @Override
    public void displayMainInfo() {
        System.out.println(super.getName() + " Высота: " + super.getHeight() + " Ширина: " +  super.getWidth() + " Материал: " + super.getMaterial() + " Цвет: " +  super.getColor() + " Количество полок: " + shelfAmount);
    }
}
