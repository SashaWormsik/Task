package com.Lesson3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {11, 10, 7, 3, 2, 4, 8, 9, 11, 10, 5};
        for (int i = array.length-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporaryVariable = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryVariable;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
