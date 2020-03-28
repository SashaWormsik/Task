package com.main.java.lesson12;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Имеется файл с текстом в котором имеются числа. Найти все числа, распечатать, посчитать сумму, убрать
все повторяющиеся и снова распечатать
 */
public class Task31 {
    final static String path = "..\\MyFile31.txt";

    public static void main(String[] args) {
        if (!checkAvailabilityFile()) {
            recordNewFail();
        }
        operation();
    }

    private static void recordNewFail() {
        System.out.print("Файла нет!\nНеобходимо создать!\nВведите строку, после нажмите ENTER: \n");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = bufferedReader.readLine();
            createNewFail(input);
        } catch (IOException e) {
            System.out.println("Wrong");
        }
    }

    private static void createNewFail(String string) {
        File myFile = new File(path);
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(myFile, true))) {
            fileWriter.write(string);
        } catch (IOException e) {
            System.out.println("Wrong");
        }
    }

    private static boolean checkAvailabilityFile() {
        File file = new File(path);
        return file.exists();
    }

    private static String getTxt() {
        StringBuilder text = new StringBuilder();
        try (BufferedReader fileText = new BufferedReader(new FileReader(path))) {
            String line = fileText.readLine();
            while (line != null) {
                text.append(line).append(" ");
                line = fileText.readLine();
            }
        } catch (IOException e) {
            System.out.println("Wrong");
        }
        return text.toString();
    }

    private static List<Integer> findDigit(String text) {
        return Stream.of(text.replaceAll("[^0-9]", " ").trim().split("\\s+")).
                filter(e -> !e.isEmpty()).
                map(Integer::valueOf).collect(Collectors.toList());
    }

    private static double sumDigit(String text) {
        return findDigit(text).stream().filter(Objects::nonNull).mapToDouble(e -> e).sum();
    }

    private static List<Integer> removeTheDuplicates(String text) {
        return findDigit(text).stream().distinct().collect(Collectors.toList());
    }

    private static void operation() {
        System.out.println("ИСХОДНЫЙ ТЕКСТ - " + getTxt());
        System.out.println("Все числа - " + findDigit(getTxt()));
        System.out.println("Сумма чисел: " + sumDigit(getTxt()));
        System.out.println("Без повторений - " + removeTheDuplicates(getTxt()));
    }
}


