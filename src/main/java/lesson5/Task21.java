package lesson5;

public class Task21 {
    public static void main(String[] args) {
        String str1 = "про";
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            str1 += str1;
        }
        System.out.println("Скорость первого способа " + (System.currentTimeMillis() - time1));
        StringBuilder str2 = new StringBuilder("про");
        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            str2 = str2.append(str2);
        }
        System.out.println("Скорость второго способа " + (System.currentTimeMillis() - time2));
        StringBuffer str3 = new StringBuffer("про");
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            str3 = str3.append(str3);
        }
        System.out.println("Скорость третьего способа " + (System.currentTimeMillis() - time3));
    }
}

