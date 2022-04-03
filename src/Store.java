import clothes.*;
import shop.Cart;
import shop.Cashier;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Store {

    public static void main(String[] args) {
        Product shirt1 = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", Shirt.Size.M);
        Product shirt2 = new Shirt("White Cotton Shirt", "BrandS", 15.99, "white", Shirt.Size.M);
        Product trousers = new Trousers("Black Cotton Trousers", "BrandT",
                29.99, "black",  SuitSize.FIFTY);
        Product shoes = new Shoes("Black Leather Shoes", "BrandS", 59.99, "black", Shoes.Size.FORTY_THREE);
        Product jacket = new Jacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", SuitSize.FIFTY);

        Cart cart = new Cart();
        cart.addToCart(shirt1);
        cart.addToCart(shirt2);
        cart.addToCart(trousers);
        cart.addToCart(shoes);
        cart.addToCart(jacket);
        Cashier.printReceipt(cart, LocalDateTime.of(LocalDate.parse("2022-02-02"), LocalTime.now()));
    }
}
