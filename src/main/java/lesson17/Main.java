package lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "         R     12  345 67891          01      ";
        System.out.println(checkWithRegExp(string));
    }

    public static boolean checkWithRegExp(String userString){
        Pattern p = Pattern.compile("^[EDR][0-9]{12}$");
        Matcher m = p.matcher(userString.replaceAll(" ", ""));
        return m.matches();
    }
}
