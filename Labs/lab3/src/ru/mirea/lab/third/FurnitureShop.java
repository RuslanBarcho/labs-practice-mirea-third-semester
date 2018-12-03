package ru.mirea.lab.third;

import java.util.ArrayList;

/**
 * Лабораторная работа 3
 * Барчо Руслан ИКБО-13-17
 * Вариант 3
*/
public  class FurnitureShop {

    public FurnitureShop(){ }

    private static ArrayList<Furniture> list = new ArrayList();

    public static void main(String[] args) {

        Sofa greenSofa = new Sofa(2,5, "Кожа", "Зеленый", 35000, "Раскладной");
        Sofa redSofa = new Sofa(2,5, "Ткань", "Красный", 20000, "Маленький");
        Cupboard woodCupboard = new Cupboard(2, 1, "дерево", "деревянный", 5000, 5);

        list.add(greenSofa);
        list.add(redSofa);
        list.add(redSofa);
        list.add(woodCupboard);

        System.out.println("Список товаров и демонстрация взаимодействия с ними:");
        for (Furniture f : list){
            f.displayMainInfo();
            if (f instanceof Cupboard){
                ((Cupboard) f).open(true);
            }
            if (f instanceof Sofa) ((Sofa) f).fold(true);
        }
    }

}
