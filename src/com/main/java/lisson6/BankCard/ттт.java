package com.main.java.lisson6.BankCard;

import java.util.ArrayList;
import java.util.HashMap;
// алгоритм для выдачи бабок
public class ттт {
    public static void main(String[] args) {
        int sum = 230;
        int money [] = {100, 50, 20};
        HashMap<Integer, Integer> nomber = new HashMap<>();
        nomber.put(100, 0);
        nomber.put(50, 0);
        nomber.put(20, 0);
        while (sum >0) {
            for (int i = 0; i < money.length; i++) {
                for (int j = money.length-1; j >= i; j--) {
                    int ost = sum - (money[i]);
                    if ((ost % money[j] == 0 || ost > money[i]+money[j]) && ost>=0) {
                        nomber.put(money[i], (nomber.get(money[i])) + 1);
                        sum -= money[i];
                    }
                }
            }
        }
        System.out.println(nomber);
    }
}
