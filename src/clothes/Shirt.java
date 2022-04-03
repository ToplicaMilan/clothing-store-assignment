package clothes;

public class Shirt extends Product {

    private final Size size;

    public Shirt(String name, String brand, double price, String colour,  Size size) {
        super(name, brand, price, colour);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String toString() {
        return super.toString() + " " + getSize();
    }

    public enum Size {
        XS, S, M, L, XL, XXL,
    }
}
