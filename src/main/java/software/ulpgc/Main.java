package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Product monitor = new Product("Monitor", 200.0, 2);
        Product cable = new Product("Cable", 5.0, 20);

        printProduct(monitor);
        printProduct(cable);
    }

    private static void printProduct(Product product) {
        System.out.println("Producto: " + product.getName() + " x" + product.getQuantity());
        System.out.println("Subtotal: " + product.getSubtotal());
        System.out.println("Descuento: " + product.getDiscount());
        System.out.println("Impuesto: " + product.getTaxAmount());
        System.out.println("Precio final: " + product.calculatePriceWithTax());
        System.out.println();
    }
}
