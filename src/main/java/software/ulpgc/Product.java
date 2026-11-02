package software.ulpgc;

public class Product {
    // Impuesto que se aplica a todos los productos (21 %)
    private static final double TAX_RATE = 0.21;

    private final String name;
    private final double price;

    public Product(String name, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Precio negativo");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithTax() {
        return price + price * TAX_RATE;
    }
}