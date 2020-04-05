package lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        FileBooks fileBooks = new FileBooks();
        if (!fileBooks.checkAvailabilityFile()){
            fileBooks.CreateFile();
            fileBooks.writeToFile(ListBooks());
        }
        Map <String, String> map = fileBooks.ReadFile().stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle,
                                Collectors.joining(", "))));
     map.forEach((key, value) -> System.out.println(key + " : " + value));
     fileBooks.fileDelete();
    }


    static List<Book> ListBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Джордж Оруэлл", "«1984»"));
        books.add(new Book("Олдос Хаксли", "«О, дивный новый мир»"));
        books.add(new Book("Рей Бредбери", "«Марсианские хроники»"));
        books.add(new Book("Рей Бредбери", "«Вино из одуванчиков»"));
        books.add(new Book("Рей Бредбери", "«451 градус по Фарингейту»"));
        books.add(new Book("Евгений Замятин", "«Мы»"));
        books.add(new Book("Джоан Роулинг", "«Гарри Поттер и философский камень»"));
        books.add(new Book("Джоан Роулинг", "«Гарри Поттер и Тайная комната»"));
        books.add(new Book("Джоан Роулинг", "«Гарри Поттер и узник Азкабана»"));
        books.add(new Book("Джоан Роулинг", "«Гарри Поттер и Кубок огня»"));
        return books;
    }
}
