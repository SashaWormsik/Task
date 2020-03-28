package com.main.java.lesson6.Appliances;

public class Main {

    public static void main(String[] args) {
        Appliances iron = new Iron("Philips", 600, true, false, true, 3);
        Appliances refrigerator = new Refrigerator("LG", 1200, 50, 600, 600, 1600, 2, "white");
        System.out.println(iron.isStatus() + " утюг");
        iron.on();
        System.out.println(iron.isStatus() + " утюг");
        System.out.println(refrigerator.isStatus()+ " холодильник");
        refrigerator.on();
        System.out.println(refrigerator.isStatus()+ " холодильник");
        refrigerator.off();
        System.out.println(refrigerator.isStatus()+ " холодильник");
    }
}
