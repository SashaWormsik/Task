package com.main.java.lisson6.BankCard;


import java.time.LocalDate;

public abstract class BankCard {
    protected String paymentSystem;
    protected CardHolder cardHolder;
    protected String issuingBank;
    protected LocalDate validity;
    protected long cardNumber;
    protected int cvv;
    protected int pinCode;

    public BankCard(String paymentSystem, CardHolder cardHolder, String issuingBank, LocalDate validity, long cardNumber, int cvv, int pinCode) {
        this.paymentSystem = paymentSystem;
        this.cardHolder = cardHolder;
        this.issuingBank = issuingBank;
        this.validity = validity;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "BankCard{" +
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
