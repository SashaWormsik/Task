package com.main.java.lesson4;

/*
Данн массив цифр. Вывести индекс максимальной цифры
 */
public class Task14 {
    public static void main(String[] args) {
        int marks[] = new int[20];
        int maxMark = 0;
        int indexMaxMark = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                indexMaxMark = i;
            }
        }
        System.out.printf("\nмаксимальная оценка %d; индекс первой максимальной оценки в массиве %d", maxMark, indexMaxMark);

    }
}