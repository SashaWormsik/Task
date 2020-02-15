package com.sasha;

import java.util.Scanner;

/*
Данно время в секундах (введенно пользователем). Следует
вывести его в формате "...недели ...дни ...часы ...минуты ...секнды"
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите время в секундах: ");
        int time = userInput.nextInt();
        int sec, min, h, week, day, rest;
        sec = time % 60;
        rest = (time - sec) / 60;
        min = rest % 60;
        rest = (rest - min) / 60;
        h = rest % 24;
        rest = (rest - h) / 24;
        day = rest % 7;
        week = (rest - day) / 7;
        System.out.print(week + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд ");
    }
}

