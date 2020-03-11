package com.main.java.lesson6.BankCard;

import java.time.LocalDate;

public class VirtualCard  extends BankCard {
    private int idNumber;

    public VirtualCard(String paymentSystem, CardHolder cardHolder, String issuingBank, LocalDate validity, long cardNumber, int cvv, int pinCode, int idNumber) {
        super(paymentSystem, cardHolder, issuingBank, validity, cardNumber, cvv, pinCode);
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "VirtualCard{" +
                "idNumber=" + idNumber +
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
