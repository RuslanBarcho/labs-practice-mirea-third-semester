package ru.mirea.lab.fourth;

/**
 * Лабораторная 4
 * Барчо Руслан ИКБО-13-17
 * Вариант 2
 */
public class Parts {
    public static void main(String[] args){
        Keyboard keyboard = new Keyboard("механическая", 8500.25, "пластик");
        Monitor monitor = new Monitor("ASUS", 12500, 24);

        System.out.println("цена клавиатуры: " + keyboard.getPrice());
        System.out.println("цена монитора: " + monitor.getPrice());
    }
}
