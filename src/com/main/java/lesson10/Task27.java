package com.main.java.lesson10;

import java.util.*;

/*
Создать список оценок, нополнить случайными оценками.
Удалить повторяющиеся числа.
 */
public class Task27 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList();
        for (int i = 0; i < (Math.random() * 10 + 10); i++) {
            marks.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(marks.toString());
        Set<Integer> newMarks = new HashSet<>(marks);
        marks.clear();
        marks.addAll(newMarks);
        System.out.println(marks.toString());
    }
}
