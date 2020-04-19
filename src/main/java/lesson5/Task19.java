package lesson5;

/*
Имеется строка. Посчитать кол-во слов. Слова могут разделяться не одним пробелом,
а несколькими, а также в начале и в конце могут быть пробелы.
 */
public class Task19 {
    public static void main(String[] args) {
        String yourText = "     dfgdf? sfsd,  888   sdf !!   ";
        yourText = yourText.trim();
        String arrString[] = yourText.split(" ");
        boolean thisWord = false;
        int count = 0;
        for (String word : arrString) {
            if (isItWord(word)) {
                count++;
            }
        }
        System.out.printf("Число слов в строке = %d", count);

    }

    static boolean isItWord(String str) {
        boolean answer = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                answer = true;
            }
        }
        return answer;
    }
}