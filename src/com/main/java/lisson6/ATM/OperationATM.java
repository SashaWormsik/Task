package com.main.java.lisson6.ATM;

public class OperationATM implements OperationCollector, OperationUser {
    Money balanceATM;
    Card myCard;

    public OperationATM(ATM myATM, Card myCard) {
        this.balanceATM = myATM.getBalanceATM();
        this.myCard = myCard;
    }

    @Override
    public void takeOffBalance(int withdrawalAmount) {
        int count100 = 0, count50 = 0, count20 = 0;
        if (withdrawalAmount > balanceATM.getBalance()) {
            System.out.printf("На балансе ATM нет столько средст.\n" +
                    "Баланс равен %d\n", balanceATM.getBalance());
        } else if (withdrawalAmount <= balanceATM.getBalance()) {
            if (withdrawalAmount >= 100) {
                count100 = withdrawalAmount / 100;
                balanceATM.setBalance(balanceATM.getBalance() - 100 * count100);
                withdrawalAmount -= 100 * count100;
            }
            if (withdrawalAmount >= 50) {
                count50 = withdrawalAmount / 50;
                balanceATM.setBalance(balanceATM.getBalance() - 50 * count50);
                withdrawalAmount -= 50 * count50;
            }
            if (withdrawalAmount >= 20) {
                count20 = withdrawalAmount / 20;
                balanceATM.setBalance(balanceATM.getBalance() - 20 * count20);
                withdrawalAmount -= 20 * count20;
            }
            if (withdrawalAmount < 20 && withdrawalAmount > 0) {
                System.out.println("Невозможно выдать сумму\n");
            } else {
                System.out.printf("%d - купюрами 20\n%d - купюрами 50\n%d - купюрами 100\n", count20, count50, count100);
            }
        }

    }

    @Override
    public void replenishBalance(Money money) {
        balanceATM.setNumberOfBanknotes20(balanceATM.getNumberOfBanknotes20() + money.getNumberOfBanknotes20());
        balanceATM.setNumberOfBanknotes50(balanceATM.getNumberOfBanknotes50() + money.getNumberOfBanknotes50());
        balanceATM.setNumberOfBanknotes100(balanceATM.getNumberOfBanknotes100() + money.getNumberOfBanknotes100());
        balanceATM.setBalance(balanceATM.getBalance() + money.getBalance());
    }

    @Override
    public boolean takeMoney(int amountOfMoney) {
        boolean operationResult = false;
        int count100 = 0, count50 = 0, count20 = 0;
        if (amountOfMoney > balanceATM.getBalance()) {
            System.out.printf("На балансе ATM нет столько средст.\n" +
                    "Баланс равен %d\n", balanceATM.getBalance());
        } else if (amountOfMoney <= balanceATM.getBalance()) {
            if (amountOfMoney >= 100) {
                count100 = amountOfMoney / 100;
                balanceATM.setBalance(balanceATM.getBalance() - 100 * count100);
                myCard.setCash(myCard.getCash()-100*count100);
                amountOfMoney -= 100 * count100;
            }
            if (amountOfMoney >= 50) {
                count50 = amountOfMoney / 50;
                balanceATM.setBalance(balanceATM.getBalance() - 50 * count50);
                myCard.setCash(myCard.getCash()-50*count50);
                amountOfMoney -= 50 * count50;
            }
            if (amountOfMoney >= 20) {
                count20 = amountOfMoney / 20;
                balanceATM.setBalance(balanceATM.getBalance() - 20 * count20);
                myCard.setCash(myCard.getCash()-20*count20);
                amountOfMoney -= 20 * count20;
            }
            if (amountOfMoney < 20 && amountOfMoney > 0) {
                System.out.println("Невозможно выдать сумму\n");
            } else {
                operationResult = true;
                System.out.printf("%d - купюрами 20\n%d - купюрами 50\n%d - купюрами 100\n", count20, count50, count100);
            }
        }
        return operationResult;
    }

    @Override
    public void putMoney(int sum) {
        myCard.setCash(myCard.getCash() + sum);
    }

    @Override
    public void getMyBalance() {
        System.out.printf("Баланс вашего счёта: %d\n", myCard.getCash());
    }

    @Override
    public boolean PinVerification(int pin) {
        return (pin == myCard.getPinCode());
    }

    public void menu() {
        System.out.println("Нажмите 1 узнать балланс счёта.");
        System.out.println("Нажмите 2 пополнить Ваш счёт.");
        System.out.println("Нажмите 3 снять наличные.");
        System.out.println("Нажмите 0 для завершения работы.");
    }
}
