package lesson6.Task25;

import java.time.LocalDate;

public class RealCard extends BankCard {

    public RealCard(String paymentSystem, CardHolder cardHolder, String issuingBank, LocalDate validity, long cardNumber, int cvv, int pinCode) {
        super(paymentSystem, cardHolder, issuingBank, validity, cardNumber, cvv, pinCode);
    }

    @Override
    public String toString() {
        return "RealCard{" +
                "paymentSystem='" + paymentSystem + '\'' +
                ", cardHolder=" + cardHolder +
                ", issuingBank='" + issuingBank + '\'' +
                ", validity=" + validity +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", pinCode=" + pinCode +
                '}';
    }
}

