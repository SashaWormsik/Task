package com.main.java.lisson6.ATM;


import java.io.*;

public class Storage {
    public static Object read(Object object) throws IOException, ClassNotFoundException {
        String name = String.format(".\\%s.txt", object.getClass().getName());
        File file = new File(name);
        file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream.available() > 0) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        return object;
    }

    public static void save(Object object) throws IOException {
        String name = String.format(".\\%s.txt", object.getClass().getName());
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static boolean checkAvailability(Object object) {
        String name = String.format(".\\%s.txt", object.getClass().getName());
        File file = new File(name);
        return file.exists();
    }

    public static void createNewCard(Card card) throws IOException {
        System.out.println("Карта ещё на создавалась. Давайте создадим!\n");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желвем пин: ");
        int userPin = Integer.parseInt(bufferedReader.readLine());
        card.setCodePIN(userPin);
        System.out.println("Введите желаемый баланс (шиканЁм): ");
        int userBalance = Integer.parseInt(bufferedReader.readLine());
        card.setBalance(userBalance);
        save(card);
    }
}
