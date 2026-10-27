package app;

public class Product {
    String name;
    int price;
    static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 5;

    public Product(String name, int price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException("Przekroczono maksymalną liczbę produktów (" + MAX_PRODUCTS + ")!"); //
        }
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }
    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
