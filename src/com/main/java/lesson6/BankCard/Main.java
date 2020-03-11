package com.main.java.lesson6.BankCard;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CardHolder cardHolder = new CardHolder("Ivan", "Ivanov");
        LocalDate val = LocalDate.now().plusYears(4);
        BankCard card = new VirtualCard("Visa",
                cardHolder,
                "BPS",
                val,
                16002500525264L,
                222,
                125,
                12);
        System.out.println(card.toString());
    }
}
