package com.main.java.lisson6.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Service {
    public static void getBalanceCard(Card card) throws IOException {
        System.out.printf("Баланс вашего счёта равен: %d\n", card.getBalance());
        Storage.save(card);
    }

    public static void putMoneyInCard(int replenishmentAmount, Card card) throws IOException {
        card.setBalance(card.getBalance() + replenishmentAmount);
        Storage.save(card);
        System.out.printf("Операция выполнена!\n" +
                "Баланс Вашего счёта: %d\n", card.getBalance());
    }

    public static void takeMoneyFromCard(int withdrawalAmount, Card card) throws IOException {
        if (withdrawalAmount > card.getBalance()) {
            System.out.printf("Операция не выполнена!\n" +
                    "Баланс Вашего счёта: %d\n" +
                    "Он менее запрашиваемой суммы\n", card.getBalance());
        } else {
            HashMap<Integer, Integer> numberFaceValue = new HashMap<>();
            for (Integer moneyValue : Money.faceValue) {
                numberFaceValue.put(moneyValue, 0);
            }
            while (withdrawalAmount > 0) {
                for (int i = 0; i < Money.faceValue.size(); i++) {
                    for (int j = Money.faceValue.size() - 1; j >= i; j--) {
                        int ost = withdrawalAmount - (Money.faceValue.get(i));
                        if ((ost % Money.faceValue.get(j) == 0 || ost >= Money.faceValue.get(i) + Money.faceValue.get(j)) && ost >= 0) {
                            numberFaceValue.put(Money.faceValue.get(i), numberFaceValue.get(Money.faceValue.get(i)) + 1);
                            card.setBalance(card.getBalance() - Money.faceValue.get(i));
                            withdrawalAmount -= Money.faceValue.get(i);

                        }
                    }
                }
            }
            Storage.save(card);
            System.out.println("Операция выполнена.\nВыданны следующие купюры\n" + numberFaceValue.toString());
            System.out.printf("Баланс Вашего счёта: %d\n", card.getBalance());
        }
    }

    public static boolean PinVerification(Card card) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean result = false;
        int count = card.getAttemptCounter();
        while (count > 0 && !card.isBlocked()) {
            System.out.println("Введите ПИН код:");
            int userInputPIN = Integer.parseInt(bufferedReader.readLine());
            if (userInputPIN == card.getCodePIN()) {
                result = true;
                break;
            } else {
                count--;
                result = false;
            }
        }
        if (!result || card.isBlocked()) {
            System.out.println("Карточка заблокирована");
            card.setBlocked(true);
            Storage.save(card);
        }
        return result;
    }
}