package lesson3;

/*
Имеется число, определить является ли оно простым.
 */
public class Task_11 {
    public static void main(String[] args) {
        long randomNumber = 765857797;    // можно было "случайное" число (int) (Math.random() * 10000000+10000);
        System.out.println(randomNumber);
        boolean simple = true;
        int lastDigitOfRandomNumber = (int) randomNumber % 10;
        if (randomNumber == 0 || randomNumber == 1) {
            simple = false;
        } else if (randomNumber == 2 || lastDigitOfRandomNumber == 1 || lastDigitOfRandomNumber == 3 || lastDigitOfRandomNumber == 7 || lastDigitOfRandomNumber == 9) {
            for (long i = 2; i < (int) (Math.sqrt(randomNumber) + 1); i++) {
                if (randomNumber % i == 0) {
                    simple = false;
                    break;
                } 
            }
        } else {
            simple = false;
        }
        String answer = simple? "число простое":"число Не простое";
        System.out.println(answer);
    }
}
