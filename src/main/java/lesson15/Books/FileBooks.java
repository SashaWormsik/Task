package lesson15.Books;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileBooks {
    private File directory = new File(".\\Books");
    private File file = new File(".\\Books\\books.txt");

    public boolean checkAvailabilityFile() {
        return this.file.exists();
    }

    public void CreateFile() {
        directory.mkdir();
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("файл не создан");
        }
    }

    public void writeToFile(List<Book> books) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.file))) {
            for (Book book : books) {
                objectOutputStream.writeObject(book);
            }
        } catch (IOException e) {
            System.out.println("файл не записан");
        }
    }

    public List<Book> ReadFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(this.file))) {
            List<Book> books = new ArrayList<>();
            while (true) {
                try {
                    books.add((Book) inputStream.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
            return books;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("не удалось прочитать файл");
            return Collections.emptyList();
        }
    }

    public void fileDelete() {
        this.file.delete();
        this.directory.delete();
    }
}
