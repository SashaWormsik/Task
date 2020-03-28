package com.main.java.lesson10;
/*
Создать список оценок с помощью ArrayList, наполнить случ. числами.
Найти максимальную оценку при помощи итератора.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task28 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList();
        for (int i = 0; i < (Math.random() * 10 + 10); i++) {
            marks.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(marks.toString());
        ListIterator<Integer> iterator = marks.listIterator();
        Integer markMax = marks.get(0);
        while (iterator.hasNext()) {
            if (iterator.next() > markMax) {
                markMax = iterator.previous();
            }
        }
        System.out.println("Максимальная оценка: " + markMax);
    }
}
