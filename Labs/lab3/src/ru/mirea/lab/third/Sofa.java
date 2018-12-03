package ru.mirea.lab.third;

public class Sofa extends Furniture {

    boolean stateFold = false;

    public Sofa(int height, int width, String material, String color, int cost, String sofaType) {
        super("Sofa", height, width, material, color, cost);
        this.sofaType = sofaType;
    }

    private String sofaType;

    public String getSofaType() {
        return sofaType;
    }

    public void fold(boolean state){
        if (sofaType.equals("Раскладной")) {
            if (state) {
                if (!stateFold) System.out.println("диван разложен");
            } else {
                if (stateFold) System.out.println("диван сложен");
            }
        } else {
            System.out.println("Действие недоступно для данного вида дивана");
        }
    }

    @Override
    public void displayMainInfo() {
        System.out.println(super.getName() + " Высота: " + super.getHeight() + " Ширина: " +  super.getWidth() + " Материал: " + super.getMaterial() + " Цвет: " +  super.getColor() + " Цена: " + super.getCost() + " Тип дивана: " + sofaType);
    }
}
