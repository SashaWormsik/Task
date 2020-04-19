package lesson2;

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
        float[] sizeHome1 = {sizeA, sizeB};
        float[] sizeHome2 = {sizeC, sizeD};
        float[] sizeArea = {sizeE, sizeF};
        Arrays.sort(sizeArea);
        Arrays.sort(sizeHome1);
        Arrays.sort(sizeHome2);
        float squareHome = sizeA * sizeB + sizeC * sizeD;
        float squareArea = sizeE * sizeF;
        float[] version1TwoHome = {sizeHome1[1] + sizeHome2[1], Math.max(sizeHome1[0], sizeHome2[0])};
        float[] version2TwoHome = {sizeHome1[1] + sizeHome2[0], Math.max(sizeHome1[0], sizeHome2[1])};
        float[] version3TwoHome = {Math.max(sizeHome1[1], sizeHome2[1]), sizeHome1[0] + sizeHome2[0]};
        float[] version4TwoHome = {sizeHome1[0] + sizeHome2[1], Math.max(sizeHome1[1], sizeHome2[0])};
        Arrays.sort(version1TwoHome);
        Arrays.sort(version2TwoHome);
        Arrays.sort(version3TwoHome);
        Arrays.sort(version4TwoHome);
        if (squareArea >= squareHome) {
            if (sizeArea[1] >= version1TwoHome[1] && sizeArea[0] >= version1TwoHome[0]) {
                System.out.println("Дома помещаются");
            } else if (sizeArea[1] >= version2TwoHome[1] && sizeArea[0] >= version2TwoHome[0]) {
                System.out.println("Дома помещаются");
            } else if (sizeArea[1] >= version3TwoHome[1] && sizeArea[0] >= version3TwoHome[0]) {
                System.out.println("Дома помещаются");
            } else if (sizeArea[1] >= version4TwoHome[1] && sizeArea[0] >= version4TwoHome[0]) {
                System.out.println("Дома помещаются");
            } else {
                System.out.println("Дома не поместяться!!!!");
            }
        } else {
            System.out.println("Дома не поместяться!!!!");
        }

    }
}
