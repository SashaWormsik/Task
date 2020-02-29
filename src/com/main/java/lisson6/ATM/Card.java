package com.main.java.lisson6.ATM;

public class Card {
    private int numberCard;
    private int cash;
    private int pinCode;
    private boolean isBlocked = true;

    public Card(int numberCard, int cash, int pinCode) {
        this.numberCard = numberCard;
        this.cash = cash;
        this.pinCode = pinCode;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
