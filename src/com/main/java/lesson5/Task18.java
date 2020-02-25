package com.main.java.lesson5;

/*
Найти в строке специальные знаки.
 */
public class Task18 {
    public static void main(String[] args) {
        String myString = "sdff sdf @? 66 %%dfg";
        char arrayChar[] = myString.toCharArray();
        int count = 0;
        for (char symbol: arrayChar){
            if (!(Character.isLetterOrDigit(symbol) || Character.isSpaceChar(symbol))){
                count++;
            }
        }
        System.out.printf("Общее колличество знаков %d", count);
    }
}
