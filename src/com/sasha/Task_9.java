package com.sasha;

public class Task_9 {
    /*
    Имеется последовательность случайных чисел,
    найти и вывести наибольшее из них.
     */
    public static void main(String[] args) {
        int max = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            if (x >= max)
                max = x;
            System.out.println(x);
            x = (int) (Math.random() * 20);
        }
        System.out.println("Максимальное число " + max);
    }
}
