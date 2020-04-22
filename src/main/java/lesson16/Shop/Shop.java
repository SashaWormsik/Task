package lesson16.Shop;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Shop implements Runnable {
    private String name;
    private Queue<Buyer> buyers;
    private Semaphore semaphore;

    public Shop(Semaphore semaphore, String name, Queue<Buyer> buyers) {
        this.semaphore = semaphore;
        this.name = name;
        this.buyers = buyers;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!buyers.isEmpty()) {
            try {
                Buyer buyer;
                semaphore.acquire();
                buyer = buyers.poll();
                semaphore.release();
                assert buyer != null;
                serviceBuyer(buyer);
            } catch (InterruptedException e) {
                System.out.println("ошибка при доступе к очереди");
                break;
            }
        }
    }

    private void serviceBuyer(Buyer buyer) {
        System.out.println("начал обслуживаться " + buyer.getName() + " на " + this.name);
        buyer.getProduct().forEach(s -> {
            System.out.println("\t" + s + "\t" + buyer.getName() + "\t" + this.name);
            try {
                Thread.sleep((long) (Math.random() * 256));
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        });
        System.out.println("закончил обслуживаться " + buyer.getName() + " на " + this.name);
    }
}
