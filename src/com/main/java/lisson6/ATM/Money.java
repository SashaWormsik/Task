package com.main.java.lisson6.ATM;

public class Money {
    private static final int FaceValueOfBanknotes20 = 20;
    private static final int FaceValueOfBanknotes50 = 50;
    private static final int FaceValueOfBanknotes100 = 100;
    private int numberOfBanknotes20;
    private int numberOfBanknotes50;
    private int numberOfBanknotes100;
    private int balance;

    public Money(int numberOfBanknotes20, int numberOfBanknotes50, int numberOfBanknotes100) {
        this.numberOfBanknotes20 = numberOfBanknotes20;
        this.numberOfBanknotes50 = numberOfBanknotes50;
        this.numberOfBanknotes100 = numberOfBanknotes100;
        this.balance = numberOfBanknotes20 * FaceValueOfBanknotes20 + numberOfBanknotes50 * FaceValueOfBanknotes50 + numberOfBanknotes100 * FaceValueOfBanknotes100;
    }

    public int getNumberOfBanknotes20() {
        return numberOfBanknotes20;
    }

    public void setNumberOfBanknotes20(int numberOfBanknotes20) {
        this.numberOfBanknotes20 = numberOfBanknotes20;
    }

    public int getNumberOfBanknotes50() {
        return numberOfBanknotes50;
    }

    public void setNumberOfBanknotes50(int numberOfBanknotes50) {
        this.numberOfBanknotes50 = numberOfBanknotes50;
    }

    public int getNumberOfBanknotes100() {
        return numberOfBanknotes100;
    }

    public void setNumberOfBanknotes100(int numberOfBanknotes100) {
        this.numberOfBanknotes100 = numberOfBanknotes100;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
