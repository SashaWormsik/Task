package com.main.java.lesson12;

import java.io.*;
import java.nio.file.Files;
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
                out.writeInt((int) (Math.random() * 10 + 1));
            }
            System.out.println("Файл записан");
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }

    private static List<Integer> readFile() {
        List<Integer> num = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            int result = in.readInt();
            while (in.available() > 0) {
                num.add(result);
                result = in.readInt();
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
                orElse(Double.NaN);
    }
}

