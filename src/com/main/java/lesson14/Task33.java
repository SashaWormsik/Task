package com.main.java.lesson14;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;
/*
Вывести список файлов и каталогов выбранного каталога на диске.
Файлы и каталоги должны быть разделены
 */
public class Task33 {


    public static void main(String[] args) {
         File file = new File("..\\");

        try {
            if (file.exists()) {
                System.out.println("Список папок: " + getDirectoryName(file));
                System.out.println("Список файлов: " + getFileName(file));
            } else {
                System.out.println("Такого пути нет");
            }
        } catch (NullPointerException e){
            System.out.println("передан Null");
        }
    }

    public static List<String> getFileName(File file) {
        if (file.isDirectory()) {
            return Arrays.stream(Objects.requireNonNull(file.listFiles())).
                    filter(File::isFile).
                    map(File::getName).
                    collect(Collectors.toList());
        } else {
            System.out.println("Данный путь указывает на один файл");
            return Collections.singletonList(file.getName());
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
            return Collections.emptyList();
        }
    }

}
