package ru.mirea;

import ru.mirea.lab.first.FirstLab;

import java.lang.*;

/**
 * Лабораторная работа 1
 * Барчо Руслан ИКБО-13-17
 * Вариант 4
 */
public class Main {
    public static void main(String[] args) {
        runFirstLab();
    }
    
    private static void runFirstLab(){
        int array[] = new int[10];
        FirstLab firstLab = new FirstLab();
        firstLab.fillArray(array);
        firstLab.printArray(array);
        firstLab.sortArray(array);
        firstLab.printArray(array);
    }
}
