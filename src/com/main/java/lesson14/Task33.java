package com.main.java.lesson14;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task33 {

    private static final File file = new File("..\\");

    public static void main(String[] args) {
        if (file.exists()) {
            System.out.println("Список папок: " + getDirectoryName(file));
            System.out.println("Список файлов: " + getFileName(file));
        } else {
            System.out.println("Такого пути нет");
        }
    }

    public static List<String> getFileName(File file) {
        if (file.isDirectory()) {
            return Arrays.stream(Objects.requireNonNull(file.listFiles())).
                    filter(File::isFile).
                    map(File::getName).
                    collect(Collectors.toList());
        } else {
            List<String> list = new ArrayList<>();
            list.add(file.getName());
            System.out.println("Данный путь указывает на один файл");
            return list;
        }
    }

    public static List<String> getDirectoryName(File file) {
        if (file.isDirectory()) {
            return Arrays.stream(Objects.requireNonNull(file.listFiles())).
                    filter(File::isDirectory).
                    map(File::getName).
                    collect(Collectors.toList());
        } else {
            System.out.println("Данный путь указывает на файл");
            return null;
        }
    }

}
