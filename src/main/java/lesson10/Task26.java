package lesson10;
/*
задание 26.
Создать arrayList со списком оценок. Заполнить случайными оценками.
Удалть неудовлетворительные оценки.
 */
import java.util.ArrayList;
import java.util.List;

public class Task26 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList();
        for (int i = 0; i < (Math.random() * 10 + 10); i++) {
            marks.add((int) (Math.random() * 10) + 1);
        }
        System.out.println(marks.toString());
        marks.removeIf(x -> (x < 4));
        System.out.println(marks.toString());
    }
}