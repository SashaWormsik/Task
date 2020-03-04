package com.main.java.lisson6.ATM;

import java.io.Serializable;

public class Card implements Serializable {
    private int codePIN;
    private int balance;
    private boolean isBlocked;
    private int attemptCounter = 3;

    public Card() {
    }

    public Card(int codePIN, int balance) {
        this.codePIN = codePIN;
        this.balance = balance;
    }

    public int getCodePIN() {
        return codePIN;
    }

    public void setCodePIN(int codePIN) {
        this.codePIN = codePIN;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getAttemptCounter() {
        return attemptCounter;
    }

    public void setAttemptCounter(int attemptCounter) {
        this.attemptCounter = attemptCounter;
    }

    @Override
    public String toString() {
        return "Card{" +
                "codePIN=" + codePIN +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                ", attemptCounter=" + attemptCounter +
                '}';
    }
}
