package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Products products = new Products();
        products.printToConsole();
        Basket basket = new Basket();
        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            basket.addPurchase(product, count);
        }
        basket.printToConsole();
        long sum = basket.sum();
        System.out.println("ИТОГО: " + sum);
    }
}
