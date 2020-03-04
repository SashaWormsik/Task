package com.main.java.lisson6.ATM;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Card card = new Card();
        if (Storage.checkAvailability(card)) {
            card = (Card) Storage.read(card);
        } else {
            Storage.createNewCard(card);
        }
        UserInterface.StartWork(card);
    }
}
