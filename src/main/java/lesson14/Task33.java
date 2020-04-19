package lesson14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Вывести список файлов и каталогов выбранного каталога на диске.
Файлы и каталоги должны быть разделены
 */
public class Task33 {


    public static void main(String[] args) {
        File file = new File(".\\src");

        try {
            if (file.exists()) {
                System.out.println("Список папок: " + getDirectoryName(file));
                System.out.println("Список файлов: " + getFileName(file));
            } else {
                System.out.println("Такого пути нет");
            }
        } catch (NullPointerException e) {
            System.out.println("передан Null");
        }
    }

    public static List<String> getFileName(File file) {
        try (Stream<Path> stream = Files.walk(file.toPath())) {
            return stream.filter(Files::isRegularFile).map(Path::toFile).map(File::getName).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("error");
            return Collections.emptyList();
        }
    }

    public static List<String> getDirectoryName(File file) {
        try (Stream<Path> stream = Files.walk(file.toPath())) {
            return stream.filter(Files::isDirectory).map(Path::toFile).map(File::getName).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("error");
            return Collections.emptyList();
        }
    }

/*
    ЭТО СТАРОЕ... на лекции сегодня (02.04) спросил про задачку, надо ли в глубину и исправил
    эти методы не выводят содержимое подкатологов

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
    }*/
}
