package shop;

import clothes.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> cart = new ArrayList<>();

    public List<Product> getCart() {
        return cart;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }
}
