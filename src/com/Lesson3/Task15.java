package com.Lesson3;

/*
определить сумму элементов массива между минимальным и максимальным
значениями
 */
public class Task15 {
    public static void main(String[] args) {
        int marks[] = {1, 9, 3, 4, 1, 8, 1, 2, 2, 9, 1};
        int MinMark = marks[0]; // задаем нач значение
        int MaxMark = marks[0]; // задаем нач значение
        /*
        находим максимум и минимум.
         */
        int lastMinOrMax = 0; // последнее макс или мин значение, необходимо далее
        int sumNumbersFinal = 0; // сумма всех элементов, необходима для нахождения минимальной суммы промежутка
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= MaxMark) {
                MaxMark = marks[i];
                lastMinOrMax = i;
            }
            if (marks[i] <= MinMark) {
                MinMark = marks[i];
                lastMinOrMax = i;
            }
            sumNumbersFinal += marks[i];
        }
        int indexStart = 0, indexEnd = 0; // переменные обозначающие начало и конец промежутка
        int stepFinal = marks.length; // переменная для нахождения колличесва чесел в промежутке
        /*
        пробегаемся по массиву находим макс или мин и считаем сумму до ближайшего мин или макс
        сохраняя сумму, размер промежутка и индексы этих мин и макс, для сравнения с предыдущими
         */
        for (int i = 0; i < lastMinOrMax; i++) {
            int step = 0;
            int sumNumbers = 0;
            int j;
            if (marks[i] == MinMark) {
                for (j = i + 1; j < marks.length; j++) {
                    if (marks[j] == MaxMark) {
                        break;
                    }
                    sumNumbers += marks[j];
                    step++;
                }
                if (stepFinal >= step && step != 0) {
                    if (sumNumbersFinal > sumNumbers) {
                        sumNumbersFinal = sumNumbers;
                        stepFinal = step;
                        indexStart = i;
                        indexEnd = j;
                    }
                }
            } else if (marks[i] == MaxMark) {
                for (j = i + 1; j < marks.length; j++) {
                    if (marks[j] == MinMark) {
                        break;
                    }
                    sumNumbers += marks[j];
                    step++;
                }
                if (stepFinal >= step && step != 0) {
                    if (sumNumbersFinal > sumNumbers) {
                        sumNumbersFinal = sumNumbers;
                        stepFinal = step;
                        indexStart = i;
                        indexEnd = j;
                    }
                }
            }
        }
        System.out.printf("Сумма чисел между минимальным (%d) и максимальным(%d) значением\n" +
                "(интервал между %d и %d) равен %d", MinMark, MaxMark, indexStart, indexEnd, sumNumbersFinal);
    }
}
