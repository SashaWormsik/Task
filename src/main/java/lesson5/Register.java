package lesson5;

public class Register {
    public static void main(String[] args) {
        String myStr = "апапаZZZZWWФ   ЁEFbk,kuu";
        System.out.println(upCase(myStr));
        System.out.println(lowCase(myStr));
    }

    static String upCase(String yourString) {
        char arrayOfString[] = yourString.toCharArray();
        for (int i = 0; i < arrayOfString.length; i++) {
            if (Character.isLetter(arrayOfString[i]) && Character.isLowerCase(arrayOfString[i])) {
                if (arrayOfString[i] == 1105){
                    arrayOfString[i] = 1125;
                }else {
                    arrayOfString[i] = (char) (arrayOfString[i] - 32);
                }
            }
        }
        return String.valueOf(arrayOfString);
    }

    static String lowCase(String yourString) {
        char arrayOfString[] = yourString.toCharArray();
        for (int i = 0; i < arrayOfString.length; i++) {
            if (Character.isLetter(arrayOfString[i]) && Character.isUpperCase(arrayOfString[i])) {
                if (arrayOfString[i] == 1125){
                    arrayOfString[i] = 1105;
                }else {
                    arrayOfString[i] = (char) (arrayOfString[i] + 32);
                }
            }
        }
        return String.valueOf(arrayOfString);
    }
}