package com.main.java.lesson3;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Введит начало промежутка");
        int userIn1 = userIn.nextInt();
        System.out.println("Введит конец промежутка");
        int userIn2 = userIn.nextInt();
        long timeStart = System.currentTimeMillis();
        for (int i = userIn1; i < userIn2; i++) {
            if (((i % 10) % 2 == 0 || i % 10 == 5 || i == 1) && (i != 5) && (i != 2)) {
                continue;
            }
            boolean isAPrime = true;
            int sqr = (int) (Math.pow(i, 0.5) + 1);
            for (int j = 3; j < sqr; j++) {
                if (i % j == 0 && i != 2) {
                    isAPrime = false;
                    break;
                }
            }
            if (isAPrime) {
                System.out.print(i + " ");
            }
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("ремя выполнения ..."+ (timeEnd - timeStart) + "мс");
    }
}
