package com.main.java.lesson9.BankCard;

public class InternationalBankCard extends PhysicalBankCard {
    private boolean internationalCard = true;

    public InternationalBankCard(int balance, CardHolder cardHolder, int numberCard) {
        super(balance, cardHolder, numberCard);
    }

    public boolean isInternationalCard() {
        return internationalCard;
    }

    @Override
    public String toString() {
        return "InternationalBankCard{" +
                "internationalCard=" + internationalCard +
                ", numberCard=" + numberCard +
                ", balance=" + balance +
                ", cardHolder=" + cardHolder +
                '}';
    }
}
