package com.main.java.lesson6.ATM;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StorageService<Card> storageService = new CardStorageService();
        UserInterface userInterface = new UserInterface();
        Card card = new Card();
        if (storageService.checkAvailability(card)) {
            card = storageService.read(card);
            userInterface.StartWork(card);
        } else {
            storageService.create(card);
        }
    }

}
