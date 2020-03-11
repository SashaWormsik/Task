package com.main.java.lesson9.BankCard;
/*
Создать иерархию классов описывающих банковские карты. Должно быть хотя бы три уровня иерархии.
 */

public class Main {
    public static void main(String[] args) {
        CardHolder cardHolder = new CardHolder("Cat", "Dogovski");
        LocalBankCard localBankCard = new LocalBankCard(1000, new CardHolder("Ivan", "Ivanov"), 1255);
        InternationalBankCard internationalBankCard = new InternationalBankCard(2000, new CardHolder("Mari", "Petrova"), 0022);
        VirtualBankCard virtualBankCard = new VirtualBankCard(200, new CardHolder("BacR", "Pypkin"), 12220022);
        System.out.println(localBankCard.toString() + "\n" + internationalBankCard.toString() + "\n" + virtualBankCard.toString());
        int c = balanceReplenishment(localBankCard, 500);
        System.out.println("после " + localBankCard.toString());
        Operation operation = new Operation(internationalBankCard);
        operation.balancePlus(220);
        System.out.println("after " + internationalBankCard.toString());
    }

    public static <T extends Card> int balanceReplenishment(Card card, int sum){
        card.setBalance(card.getBalance() + sum);
        return card.getBalance();
    }
}
