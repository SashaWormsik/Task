package com.main.java.lisson6.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    public static void StartWork(Card card) throws IOException {
        if (Service.PinVerification(card)) {
            boolean status = true;
            while (status) {
                MENU();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int userInput = Integer.parseInt(bufferedReader.readLine());
                switch (userInput) {
                    case 1:
                        Service.getBalanceCard(card);
                        status = continueOrNot();
                        break;
                    case 2:
                        System.out.print("Введите сумму пополнения: ");
                        int replenishmentAmount = Integer.parseInt(bufferedReader.readLine());
                        Service.putMoneyInCard(replenishmentAmount, card);
                        status = continueOrNot();
                        break;
                    case 3:
                        System.out.print("Введите сумму пополнения: ");
                        int withdrawalAmount = Integer.parseInt(bufferedReader.readLine());
                        Service.takeMoneyFromCard(withdrawalAmount, card);
                        status = continueOrNot();
                        break;
                    case 0:
                        System.out.println("До новых встреч!");
                        status = false;
                        break;
                    default:
                        System.out.println("Wrong input");
                }
            }
        }
    }

    public static void MENU() {
        System.out.print("\tНажмите 1 узнать балланс счёта.\n" +
                "\tНажмите 2 пополнить Ваш счёт.\n" +
                "\tНажмите 3 снять наличные.\n" +
                "\tНажмите 0 для завершения работы.\n");
    }

    public static boolean continueOrNot() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\tПродолжить?\n\t1 - ДА 2 - НЕТ");
        int userIn = Integer.parseInt(bufferedReader.readLine());
        if (userIn == 1) return true;
        else {
            System.out.println("До новых встреч!");
            return false;
        }
    }
}
