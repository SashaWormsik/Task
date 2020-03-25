package com.main.java.lesson12;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Создать файл с текстом. Прочитать, подсчитать колличество знаков препинания и слов
 */
public class Task30 {
    final static String path = "..\\MyFile30.txt";

    public static void main(String[] args) {
        if (!checkAvailabilityFile()) {
            recordNewFail();
        }
        Operation();
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

    private static long countSymbol(String text) {
        return text.chars().filter(c -> !Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)).count();
    }

    private static long countWord(String text) {
        return Stream.of(text.replaceAll("[^A-Za-zА-Яа-я]", " ").trim().split("\\s+"))
                .filter(e -> e.length() > 0)
                .count();
    }

    private static void Operation() {
        System.out.println("ИСХОДНЫЙ ТЕКСТ - " + getTxt());
        System.out.println("Колличество слов: " + countWord(getTxt()));
        System.out.println("Колличество знаков препинания: " + countSymbol(getTxt()));
    }
}