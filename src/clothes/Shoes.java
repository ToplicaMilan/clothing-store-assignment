package clothes;

public class Shoes extends Product {

    private Size size;

    public Shoes(String name, String brand, double price, String color, Size size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public enum Size {

        THIRTY_NINE(Size.SIZE_THIRTY_NINE),
        FORTY(Size.SIZE_THIRTY_NINE),
        FORTY_ONE(Size.SIZE_THIRTY_NINE),
        FORTY_TWO(Size.SIZE_THIRTY_NINE),
        FORTY_THREE(Size.SIZE_THIRTY_NINE),
        FORTY_FOUR(Size.SIZE_THIRTY_NINE),
        FORTY_FIVE(Size.SIZE_THIRTY_NINE),
        FORTY_SIX(Size.SIZE_THIRTY_NINE);

        public static final int SIZE_THIRTY_NINE = 39;
        public static final int SIZE_FORTY = 40;
        public static final int SIZE_FORTY_ONE = 41;
        public static final int SIZE_FORTY_TWO = 42;
        public static final int SIZE_FORTY_THREE = 43;
        public static final int SIZE_FORTY_FOUR = 44;
        public static final int SIZE_FORTY_FIVE = 45;
        public static final int SIZE_FORTY_SIX = 46;

        Size(int size) {}

    }
}
