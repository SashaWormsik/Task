package lesson2;

import java.util.Scanner;

/*
Данно число (введено пользователем). Определить, является ли последняя
цифра числа семеркой.
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = userInput.nextInt();
        if (num % 10 == 7) {
            System.out.println("Последняя цифра семь");
        } else {
            System.out.println("Последняя цифра не семь");
        }
    }
}
