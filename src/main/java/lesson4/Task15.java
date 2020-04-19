package lesson4;

/*
определить сумму элементов массива между минимальным и максимальным
значениями
 */
public class Task15 {
    public static void main(String[] args) {
        int marks[] = {1, 2, 1, 8, 10, 1, 1, 10, 2};
        int MinMark = marks[0]; // задаем нач значение мин
        int MaxMark = marks[0]; // задаем нач значения макс
        int step = marks.length; // нач значение промежутка
        int sumFinal = 0; // значение суммы
        int indexStart = 0, indexEnd = 0; // индексы начала и конца промежутков
        /*
        находим мин и мак значения в массиве
         */
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= MaxMark) {
                MaxMark = marks[i];
            }
            if (marks[i] <= MinMark) {
                MinMark = marks[i];
            }
            sumFinal += marks[i];
        }
        /*
        пробегаемя по массиву, сравниваем значения с мин и макс, сравниваем промежуток и сумму чисел в
        промежутке, и что б между мин и макс были числа, если всё удовлетворяет переприсваиваем значения
         */
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
                if ((marks[i] == MinMark) && (marks[j] == MaxMark) && (step >= Math.abs(i - j) - 1)
                        && (sumFinal > sumSecondary(marks, i, j)) && (Math.abs(i - j) - 1) != 0) {
                    step = Math.abs(i - j) - 1;
                    sumFinal = sumSecondary(marks, i, j);
                    indexEnd = Math.max(i, j);
                    indexStart = Math.min(i, j);
                }
            }
        }
        System.out.printf("Наименьшая сумма в наименьшем промужутке равна - %d, промежуток между индексами %d и %d",
                sumFinal, indexStart, indexEnd);
    }

    /*
    метод для нахождения суммы чисел в промежутке значений
     */
    public static int sumSecondary(int array[], int i, int j) {
        int sumInterim = 0;
        for (int k = Math.min(i, j) + 1; k < Math.max(i, j); k++) {
            sumInterim += array[k];
        }
        return sumInterim;

    }
}
