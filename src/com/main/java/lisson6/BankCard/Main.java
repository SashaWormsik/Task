package com.main.java.lisson6.BankCard;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CardHolder cardHolder = new CardHolder("Ivan", "Ivanov");
        LocalDate val = LocalDate.of(2012, 2, 21);
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
