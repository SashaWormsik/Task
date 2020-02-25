package com.main.java.lesson5;

/*
Имеется строка с текстом. Вывывести текс состоящий из последних букв слов в данной строке.
 */
public class Task20 {
    public static void main(String[] args) {
        String yourText = "     dfgdf? sfsd,  888   sdf !!   ";
        yourText = yourText.trim();
        String arrString[] = yourText.split(" ");
        String newString = "";
        for (String word : arrString) {
            for (int i = word.length()-1; i > 0; i--) {
                if (Character.isLetter(word.charAt(i))){
                    newString += word.charAt(i);
                    break;
                }
            }
        }
        System.out.println(newString);
    }
}

