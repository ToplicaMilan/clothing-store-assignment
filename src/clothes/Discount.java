package clothes;

public class Discount {

    private final String discountPercentage;
    private final double discountValue;

    public Discount(String discountPercentage, double discountValue) {
        this.discountPercentage = discountPercentage;
        this.discountValue = discountValue;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public double getDiscountValue() {
        return discountValue;
    }
}
