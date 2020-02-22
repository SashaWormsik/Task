package com.Lesson3;

public class Task16String {
    public static void main(String[] args) {
        String flipString = "Flip line";
        /*
        переворот строки через массив.
         */
        char[] charString = flipString.toCharArray();
        for (int i = 0; i < charString.length / 2; i++) {
            char temporaryVariable = charString[charString.length - i - 1];
            charString[charString.length - i - 1] = charString[i];
            charString[i] = temporaryVariable;
        }
        System.out.println(charString);
        /*
        При помощи классов StringBuffer и StringBuilder
         */
        StringBuffer reverseString = new StringBuffer(flipString);
        System.out.println(reverseString.reverse().toString());
        StringBuilder reverseStringOther = new StringBuilder(flipString);
        System.out.println(reverseStringOther.reverse().toString());
    }
}

