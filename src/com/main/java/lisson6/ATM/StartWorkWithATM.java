package com.main.java.lisson6.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartWorkWithATM {
    public static void start() throws IOException, IllegalStateException {
        ATM myATM = new ATM(10, 10, 10);
        Card myCard = new Card(15002500, 3250, 1255);
        OperationATM operationATM = new OperationATM(myATM, myCard);
        while (true) {
            operationATM.menu();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int userInput;
            userInput = Integer.parseInt(bufferedReader.readLine());
            if (userInput == 0) break;
            switch (userInput) {
                case 1:
                    operationATM.getMyBalance();
                    break;
                case 2:
                    int replenishmentAmount = Integer.parseInt(bufferedReader.readLine());
                    operationATM.putMoney(replenishmentAmount);
                    break;
                case 3:
                    int withdrawalAmount = Integer.parseInt(bufferedReader.readLine());
                    operationATM.takeMoney(withdrawalAmount);
                    break;
                default:
                    System.out.println("Wrong input");
            }

        }
    }
}
