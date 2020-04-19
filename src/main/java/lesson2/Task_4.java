package lesson2;

import java.util.Scanner;

/*
Имеется прямоугольное отверстие размерами a и b (введено пользователем).
Определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 */
public class Task_4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите сторону а: ");
        int sideA = userInput.nextInt();
        System.out.print("Введите сторону b: ");
        int sideB = userInput.nextInt();
        System.out.print("Введите радиус r: ");
        int radius = userInput.nextInt();
        double diagonal = Math.sqrt((sideA * sideA + sideB * sideB));
        if (2 * radius >= diagonal) {
            System.out.println("да");
        } else{
            System.out.println("нет");
        }

    }
}
