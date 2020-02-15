package com.sasha;

import java.util.Arrays;
import java.util.Scanner;

/*
Имеется два дома размерами a на b и с на d. Имеется участок размером e на f.
Проверить помещаются ли эти дома на данном участке. Стороны домов - параллельны сторонам участка,
в остальном размещение произвольное.
 */
public class Task_7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите сторону первого дома а: ");
        float sizeA = userInput.nextFloat();
        System.out.print("Введите сторону первого дома b: ");
        float sizeB = userInput.nextFloat();
        System.out.print("Введите сторону второго дома c: ");
        float sizeC = userInput.nextFloat();
        System.out.print("Введите сторону второго дома d: ");
        float sizeD = userInput.nextFloat();
        System.out.print("Введите сторону участка e: ");
        float sizeE = userInput.nextFloat();
        System.out.print("Введите сторону участка f: ");
        float sizeF = userInput.nextFloat();
        float [] sizeHome1 = {sizeA, sizeB};
        float [] sizeHome2 = {sizeC, sizeD};
        Arrays.sort(sizeHome1);
        Arrays.sort(sizeHome2);
        float largestSizeHomes = Math.max(sizeHome1[1], sizeHome2[1]);
        float largestSizeArea = Math.max(sizeE, sizeF);
        float smallestSizeArea = Math.min(sizeE, sizeF);
        if (largestSizeArea > largestSizeHomes){
            if (smallestSizeArea >(sizeHome1[0]+sizeHome2[0])){
                System.out.println("Дома помещаются");
            }
            else {
                System.out.println("Дома не влезут");
            }
        }else {
            System.out.println("Дома не влезут");
        }
    }
}
