package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Teclado", 100.0);

        System.out.println("Producto: " + product.getName());
        System.out.println("Precio base: " + product.getPrice());
        System.out.println("Precio final: " + product.calculatePriceWithTax());
    }
}