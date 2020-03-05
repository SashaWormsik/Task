package com.main.java.lisson6.ATM;

import java.util.ArrayList;

public class Money {
    public static final ArrayList<Integer> faceValue = new ArrayList<>();

    static {
        faceValue.add(100);
        faceValue.add(50);
        faceValue.add(20);
    }

    public static ArrayList<Integer> getFaceValue() {
        return faceValue;
    }
}
