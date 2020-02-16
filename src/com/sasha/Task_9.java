package com.sasha;

public class Task_9 {
    /*
    Имеется последовательность случайных чисел,
    найти и вывести наибольшее из них.
     */
    public static void main(String[] args) {
        int max = 0;
        int randomNamber = (int) (Math.random() * 20);
        while (randomNamber != 0) {
            if (randomNamber >= max)
                max = randomNamber;
            System.out.println(randomNamber);
            randomNamber = (int) (Math.random() * 20);
        }
        System.out.println("Максимальное число " + max);
    }
}
