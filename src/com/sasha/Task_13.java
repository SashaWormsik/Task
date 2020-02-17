package com.sasha;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Введит начало промежутка");
        int userIn1 = userIn.nextInt();
        System.out.println("Введит конец промежутка");
        int userIn2 = userIn.nextInt();
        long t = System.currentTimeMillis();
        for (int i = userIn1; i < userIn2; i++) {   // число для проверки
            if (((i % 10) % 2 == 0 || i % 10 == 5 || i == 1) && (i != 5) && (i != 2)) {
                continue;
            }
            boolean a = true;
            int sqr = (int) (Math.pow(i, 0.5) + 1);
            for (int j = 3; j < sqr; j++) { // проверяем или делится на другие числа
                if (i % j == 0 && i != 2) {
                    a = false;
                    break;
                }

            }
            if (a) {
                System.out.print(i + " ");
            }

        }
        long t1 = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println(t1 - t);
    }
}
