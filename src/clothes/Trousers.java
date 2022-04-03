package clothes;

public class Trousers extends Product {

    private final SuitSize size;

    public Trousers(String name, String brand, double price, String color, SuitSize size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public SuitSize getSize() {
        return size;
    }
}
