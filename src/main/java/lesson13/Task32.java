package lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Записать в двоичный файл 20 случайных чисел. Прочитать файл, распечатать числа, найти их среднее арифметическое.
 */
public class Task32 {
    final static String path = "..\\Task32.txt";

    public static void main(String[] args) {
        writeNumbersToTheFile();
        System.out.println(readFile());
        System.out.println(average(readFile()));
    }

    private static void writeNumbersToTheFile() {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            for (int i = 0; i < 20; i++) {
                out.writeInt((int) (Math.random() * 5 + 6));
            }
            System.out.println("Файл записан");
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    private static List<Integer> readFile() {
        List<Integer> num = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            while (in.available() > 0) {  //исправил сегодня (27.04), после того,как Вике сказал, что выводится 19 чисел
                int result = in.readInt();
                num.add(result);
            }
        } catch (IOException e) {
            System.out.println("ERROR");
        }
        return num;
    }

    public static Double average(List<Integer> list) {
        return list.stream().
                mapToDouble(e -> e).
                filter(Objects::nonNull).
                average().
                orElse(0.0);
    }
}

