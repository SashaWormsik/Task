package com.main.java.lisson6.ATM;

import java.io.*;

public class CardStorageService implements StorageService<Card> {

    @Override
    public Card read(Card object) throws IOException, ClassNotFoundException {
        String name = String.format("..\\%s.txt", object.getClass().getName());
        File file = new File(name);
        boolean s = file.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream.available() > 0) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = (Card) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        return object;
    }

    @Override
    public void save(Card object) throws IOException {
        String name = String.format("..\\%s.txt", object.getClass().getName());
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    @Override
    public boolean checkAvailability(Card object) {
        String name = String.format("..\\%s.txt", object.getClass().getName());
        File file = new File(name);
        return file.exists();
    }

    @Override
    public void create(Card card) throws IOException {
        System.out.println("Карта ещё на создавалась. Давайте создадим!\n");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемый пин: ");
        int userPin = Integer.parseInt(bufferedReader.readLine());
        card.setCodePIN(userPin);
        System.out.println("Введите желаемый баланс (шиканЁм): ");
        int userBalance = Integer.parseInt(bufferedReader.readLine());
        card.setBalance(userBalance);
        save(card);
    }
}
