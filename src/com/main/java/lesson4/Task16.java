package com.main.java.lesson4;

/*
Создать массив, заполнить случайными числами, вывести, перевернуть,
распечатать (нежелательно создавать новый массив, и не просто вывести
в обратном порядке, а что б именно был зеркальный МАССИВ)
 */
public class Task16 {
    public static void main(String[] args) {
        int marks[] = new int[6];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            if (i < marks.length / 2) {
                int temporaryVariable = marks[i];
                marks[i] = marks[marks.length - i - 1];
                marks[marks.length - i - 1] = temporaryVariable;
            }
            System.out.print(marks[i] + " ");
        }
    }
}

