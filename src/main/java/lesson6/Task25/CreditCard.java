package lesson6.Task25;

import java.time.LocalDate;

public class CreditCard extends RealCard {
    int balance;

    public CreditCard(String paymentSystem, CardHolder cardHolder, String issuingBank, LocalDate validity, long cardNumber, int cvv, int pinCode, int balance) {
        super(paymentSystem, cardHolder, issuingBank, validity, cardNumber, cvv, pinCode);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", paymentSystem='" + paymentSystem + '\'' +
                ", cardHolder=" + cardHolder +
                ", issuingBank='" + issuingBank + '\'' +
                ", validity=" + validity +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", pinCode=" + pinCode +
                '}';
    }
}
