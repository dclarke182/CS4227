package Visitor;

public class testOutput {
    public static void main(String args[]) {
        Item[] items = new Item[] {
                new Clothing("Hoodie", "Medium", 19.99), new Clothing("T-Shirt", "Large", 14.99),
                new Shoes("Nikes", 10, 49.99), new Shoes("Yeezys", 11, 1449.99)
        };

        double totalPrice = calcTotalPrice(items);
        System.out.println("\nTotal Price of Cart: " + totalPrice);

    }

    public static double calcTotalPrice(Item[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartImplementation();
        double sum = 0;
        for (Item item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
