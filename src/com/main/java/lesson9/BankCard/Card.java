package com.main.java.lesson9.BankCard;

public abstract class Card {
    protected int balance;
    protected CardHolder cardHolder;

    public Card(int balance, CardHolder cardHolder) {
        this.balance = balance;
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                ", cardHolder=" + cardHolder +
                '}';
    }
}
