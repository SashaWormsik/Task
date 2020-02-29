package com.main.java.lisson6.ATM;

public interface OperationCollector {
    void takeOffBalance(int withdrawalAmount);
    void replenishBalance(Money money);
}
