package com.main.java.lesson3;

/*
Имеется последовательность случайных чисел,
найти и вывести наибольшее из них. (вывожу числа для наглядности)
 */
public class Task_9 {
    public static void main(String[] args) {
        int max = 0;
        int randomNumber = (int) (Math.random() * 20);
        while (randomNumber != 0) {
            if (randomNumber >= max)
                max = randomNumber;
            System.out.printf("|%d| ", randomNumber);
            randomNumber = (int) (Math.random() * 20);
        }
        System.out.println("Максимальное число " + max);
    }
}
