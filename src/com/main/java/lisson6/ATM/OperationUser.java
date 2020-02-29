package com.main.java.lisson6.ATM;

public interface OperationUser {
    boolean takeMoney(int amountOfMoney);
    void putMoney(int sum);
    void getMyBalance();
    boolean PinVerification(int pin);
}
