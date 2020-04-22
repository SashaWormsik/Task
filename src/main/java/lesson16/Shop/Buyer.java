package lesson16.Shop;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private String name;
    private List<String> product;

    public Buyer(String name) {
        this.name = name;
        this.product = putProducts();
    }

    public String getName() {
        return name;
    }

    public List<String> getProduct() {
        return product;
    }

    private static List<String> putProducts() {
        List<String> productsBuyers = new ArrayList<>();
        int number = (int) (Math.random() * 5 + 3);
        for (int i = 0; i < number; i++) {
            int n = (int) (Math.random() * (Products.getProducts().size()));
            productsBuyers.add(Products.getProducts().get(n));
        }
        return productsBuyers;
    }
}
