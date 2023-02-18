package org.example;

import java.util.Map;

public class Basket implements ConsolePrintable {
    private Products products = new Products();
    private Purchase[] purchases;

    public Basket() {
        purchases = new Purchase[products.getProducts().size()];
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    @Override
    public void printToConsole() {
        Products products = new Products();
        Map<String, Integer> prices = products.getProducts();
        System.out.println("КОРЗИНА:");
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
        }
    }

    public long sum() {
        Products products = new Products();
        Map<String, Integer> prices = products.getProducts();
        int sum = 0;
        for (Purchase purchase : purchases) {
            if (purchase == null) continue;
            sum += purchase.count * prices.get(purchase.title);
        }
        return sum;
    }

}
