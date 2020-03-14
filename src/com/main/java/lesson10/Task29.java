package com.main.java.lesson10;
/*
Имеется текст. Составить частотный словарь для него.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task29 {
    public static void main(String[] args) throws IOException {
        System.out.print("insert text:\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();

        List<String> words = Arrays.asList(text.toLowerCase().replaceAll("[^A-Za-zА-Яа-я_]", " ").split("\\s+"));
        System.out.println(words.toString());

        Map<String, Integer> vocabulary = new HashMap<>();
        words.forEach(word -> vocabulary.put(word, vocabulary.containsKey(word) ? vocabulary.get(word) + 1 : 1));

        System.out.println(vocabulary.toString());
    }
}
