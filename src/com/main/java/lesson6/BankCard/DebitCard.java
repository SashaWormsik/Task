package com.main.java.lesson6.BankCard;
import java.time.LocalDate;

public class DebitCard extends RealCard {
    public DebitCard(String paymentSystem, CardHolder cardHolder, String issuingBank, LocalDate validity, long cardNumber, int cvv, int pinCode) {
        super(paymentSystem, cardHolder, issuingBank, validity, cardNumber, cvv, pinCode);
    }
}
