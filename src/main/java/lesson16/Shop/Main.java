package lesson16.Shop;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Queue<Buyer> buyers = generationBuyers(9);
        Shop shop1 = new Shop(semaphore, "Касса 1", buyers);
        Shop shop2 = new Shop(semaphore, "Касса 2", buyers);
    }

    static Queue<Buyer> generationBuyers(int number) {
        Queue<Buyer> buyers = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            buyers.add(new Buyer("Покупатель " + i));
        }
        return buyers;
    }
}
