package com.main.java.lisson6.ATM;

public class ATM {
    Money balanceATM;

    public ATM(int Money20, int Money50, int Money100) {
        this.balanceATM = new Money(Money20, Money50, Money100);
    }

    public Money getBalanceATM() {
        return balanceATM;
    }

    public void setBalanceATM(Money balanceATM) {
        this.balanceATM = balanceATM;
    }

}