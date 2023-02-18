package org.example;

import java.util.HashMap;
import java.util.Map;

public class Products implements ConsolePrintable {
    HashMap<String, Integer> products;

    Products() {
        products = new HashMap<>();
        addBaseProducts();
    }

    public HashMap<String, Integer> getProducts() {
        return products;
    }

    private void addBaseProducts() {
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
    }

    @Override
    public void printToConsole() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
    }
}
