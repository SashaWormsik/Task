package com.main.java.lisson6.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Service {
    StorageService<Card> storageService = new CardStorageService();

    public void getBalanceCard(Card card) throws IOException {
        System.out.printf("Баланс вашего счёта равен: %d\n", card.getBalance());
    }

    public void putMoneyInCard(int replenishmentAmount, Card card) throws IOException {
        card.setBalance(card.getBalance() + replenishmentAmount);
        storageService.save(card);
        System.out.printf("Операция выполнена!\n" +
                "Баланс Вашего счёта: %d\n", card.getBalance());
    }

    public void takeMoneyFromCard(int withdrawalAmount, Card card) throws IOException {
        if (withdrawalAmount > card.getBalance()) {
            System.out.printf("Операция не выполнена!\n" +
                    "Баланс Вашего счёта: %d\n" +
                    "Он менее запрашиваемой суммы\n", card.getBalance());
        } else if (withdrawalAmount < 20 || withdrawalAmount == 30 || withdrawalAmount % 10 != 0) {
            System.out.println("Банкомат не может выдать данную сумму!\nСумма должна быть более 20 р, не 30 р, и должна быть кратна 10");
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
            storageService.save(card);
            System.out.println("Операция выполнена.\nВыданны следующие купюры\n" + numberFaceValue.toString());
            System.out.printf("Баланс Вашего счёта: %d\n", card.getBalance());
        }
    }

    public boolean PinVerification(Card card) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean result = false;
        while (card.getAttemptCounter() > 0 && !card.isBlocked()) {
            System.out.println("Введите ПИН код:");
            int userInputPIN = Integer.parseInt(bufferedReader.readLine());
            if (userInputPIN == card.getCodePIN()) {
                result = true;
                card.setAttemptCounter(3);
                storageService.save(card);
                break;
            } else {
                card.setAttemptCounter(card.getAttemptCounter() - 1);
                storageService.save(card);
                result = false;
            }
        }
        if (!result || card.isBlocked()) {
            System.out.println("Карточка заблокирована");
            card.setBlocked(true);
            storageService.save(card);
        }
        return result;
    }
}