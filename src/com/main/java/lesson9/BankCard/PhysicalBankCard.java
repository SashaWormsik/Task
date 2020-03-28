package com.main.java.lesson9.BankCard;

public class PhysicalBankCard extends Card {
    protected int numberCard;

    public PhysicalBankCard(int balance, CardHolder cardHolder, int numberCard) {
        super(balance, cardHolder);
        this.numberCard = numberCard;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

}
