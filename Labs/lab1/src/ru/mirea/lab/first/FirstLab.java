package ru.mirea.lab.first;

import java.util.Arrays;
import java.util.Random;

public class FirstLab {

    private Random random = new Random(System.currentTimeMillis());

    public void printArray(int[] array){
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println("");
    }

    public void fillArray(int[] array){
        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(101);
        }
    }

    public void sortArray(int[] array){
        Arrays.sort(array);
        //if needed reverse with ArrayUtils
    }
}
