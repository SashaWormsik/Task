package com.sasha;

import java.util.Scanner;

/*
Найти факториал числа.
 */
public class Task_8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите число: ");
        long numbFactorial = userInput.nextLong();
        long factorial = 1;
        long i = 1;
        while (i <= numbFactorial) {
            factorial *= i;
            i++;
        }
        System.out.println("факториал числа " + factorial);
    }
}