package lesson16.Shop;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private static List<String> listProducts = new ArrayList<>();

    static {
        listProducts.add("курица");
        listProducts.add("молоко");
        listProducts.add("яйца");
        listProducts.add("бумага");
        listProducts.add("сметана");
        listProducts.add("творог");
        listProducts.add("мыло");
        listProducts.add("имбирь");
        listProducts.add("гречка");
        listProducts.add("лимон");
        listProducts.add("маска");
        listProducts.add("печень");
        listProducts.add("хлеб");
        listProducts.add("пиво");
    }

    public static List<String> getProducts() {
        return listProducts;
    }
}
