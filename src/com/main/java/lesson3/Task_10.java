package com.main.java.lesson3;

/*
Имеется число. Необходимо посчитать сумму цифр данного числа.
 */
public class Task_10 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 1000);
        System.out.printf("%d - случайное число\n", randomNumber);
        int sumDigit = 0;
        while (randomNumber > 0) {
            sumDigit += randomNumber % 10;
            randomNumber /= 10;
        }
        System.out.printf("%d - сумма цифр данного числа", sumDigit);
    }
}