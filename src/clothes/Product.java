package clothes;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Product {

    private final String name;
    private final String brand;
    private final double price;
    private final String color;

    public Product(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Discount calculateDiscount(LocalDate dateOfPurchase, boolean isQuantityDiscount) {
        double discount = 0;
        String discountPercentage = null;

        if (isQuantityDiscount) {
            discount = getPrice() * 0.2;
            discountPercentage = "20%";
        }
        if (dateOfPurchase.getDayOfWeek() == DayOfWeek.TUESDAY) {
            if (this instanceof Shoes) {
                discount = getPrice() * 0.25;
                discountPercentage = "25%";
            }
            if (this instanceof Shirt && !isQuantityDiscount) {
                discount = getPrice() * 0.1;
                discountPercentage = "10%";
            }
        }
        return new Discount(discountPercentage, discount);
    }

    public String toString() {
        return getName() + " - " + getBrand();
    }
}
