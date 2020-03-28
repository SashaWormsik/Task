package com.main.java.lesson10;

import java.util.*;
import java.util.stream.Collectors;

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
        List<Integer> copyMarks = new ArrayList<>(marks);
        // первый способ через Set (но тогда теряется порядок)
        Set<Integer> newMarks = new HashSet<>(copyMarks);
        copyMarks.clear();
        copyMarks.addAll(newMarks);
        System.out.println(copyMarks.toString());
        // или можно так, порядок сохраняется
        marks = marks.stream().distinct().collect(Collectors.toList());
        System.out.println(marks.toString());
    }
}
