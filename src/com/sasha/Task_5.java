package com.sasha;

import java.util.Scanner;
/*
Имеется целое число (любое), это число - сумма денег в рублях.
Вывести это число, добавив к нему слово "рублей" в правильном падеже.
 */
public class Task_5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        int money = userInput.nextInt();
        int lastNum = money % 10;
        if (money % 100 >= 10 && money % 100 <= 15 || lastNum == 0) {
            System.out.println(money + " рублей");
        } else if (lastNum >= 2 && lastNum <= 4) {
            System.out.println(money + " рубля");
        } else if (lastNum >= 5 ) {
            System.out.println(money + " рублей");
        } else if (lastNum == 1) {
            System.out.println(money + " рубль");
        }

    }
}