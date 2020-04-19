package lesson6.Task23;

import java.io.IOException;

public interface StorageService<T> {
    T read(T object) throws IOException, ClassNotFoundException;
    void save(T object) throws IOException;
    boolean checkAvailability(T object);
    void create(T object) throws IOException;
}
