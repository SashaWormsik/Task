package com.main.java.lesson9.BankCard;

public class LocalBankCard extends PhysicalBankCard {
    private boolean localCard = true;

    public LocalBankCard(int balance, CardHolder cardHolder, int numberCard) {
        super(balance, cardHolder, numberCard);
    }

    public boolean isLocalCard() {
        return localCard;
    }

    @Override
    public String toString() {
        return "LocalBankCard{" +
                "localCard=" + localCard +
                ", numberCard=" + numberCard +
                ", balance=" + balance +
                ", cardHolder=" + cardHolder +
                "} " ;
    }
}
