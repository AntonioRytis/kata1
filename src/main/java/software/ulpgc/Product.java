package software.ulpgc;

public class Product {
    private static final double TAX_RATE = 0.21;
    private static final double DISCOUNT_RATE = 0.10;
    private static final int DISCOUNT_MIN_QUANTITY = 10;

    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        if (price < 0) {
            throw new IllegalArgumentException("Precio negativo");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Cantidad no válida");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return price * quantity;
    }

    public double getDiscount() {
        if (quantity >= DISCOUNT_MIN_QUANTITY) {
            return getSubtotal() * DISCOUNT_RATE;
        }
        return 0;
    }

    public double getTaxAmount() {
        return (getSubtotal() - getDiscount()) * TAX_RATE;
    }

    public double getPriceWithTax() {
        return getSubtotal() - getDiscount() + getTaxAmount();
    }
}
