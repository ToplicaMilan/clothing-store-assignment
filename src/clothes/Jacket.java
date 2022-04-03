package clothes;

public class Jacket extends Product {

    private final SuitSize size;

    public Jacket(String name, String brand, double price, String color, SuitSize size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public SuitSize getSize() {
        return size;
    }

}
