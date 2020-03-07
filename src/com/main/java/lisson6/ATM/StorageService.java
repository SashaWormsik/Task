package com.main.java.lisson6.ATM;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface StorageService<T> {
    T read(T object) throws IOException, ClassNotFoundException;
    void save(T object) throws IOException;
    boolean checkAvailability(T object);
    void create(T object) throws IOException;
}
