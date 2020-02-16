package com.sasha;

import java.util.Scanner;

/*
Имеются три числа  - день, месяц, год. Вывести в виде трех чисел
дату следующего дня.
 */
public class Task_6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = userInput.nextInt();
        int dayInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            dayInMonth[1] = 28;
        } else {
            dayInMonth[1] = 29;
        }
        System.out.print("Введите месяц (в числовом формате): ");
        int month = userInput.nextInt();
        while (month > 12 && month < 0) {
            System.out.print("Введите месяц (ОТ 1 ДО 12)!!!!: ");
            month = userInput.nextInt();
        }
        System.out.print("Введите день: ");
        int day = userInput.nextInt();
        while (day > dayInMonth[month - 1]) {
            System.out.println("В выбранном месяце " + dayInMonth[month - 1] + " дней");
            System.out.print("Попробуйте снова\nВведите день: ");
            day = userInput.nextInt();
        }
        int nDay;
        int nMonth;
        int nYear;
        if (day == dayInMonth[month - 1]) {
            nDay = 1;
            if (month == 12) {
                nMonth = 1;
                nYear = year + 1;
            } else {
                nMonth = month + 1;
                nYear = year;
            }
        } else {
            nDay = day + 1;
            nMonth = month;
            nYear = year;

        }
        System.out.println(nDay + " " + nMonth + " " + nYear);

    }
}