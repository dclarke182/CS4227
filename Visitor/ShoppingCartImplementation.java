package Visitor;

public class ShoppingCartImplementation implements ShoppingCartVisitor {

    @Override
    public double visit(Clothing clothing) {
        double price = clothing.getPrice();
        System.out.println(
                "Item: " + clothing.getItemName() + "\t\tSize: " + clothing.getClothingSize() + "\t\tPrice: " + price);
        return price;
    }

    @Override
    public double visit(Shoes shoes) {
        double price = shoes.getPrice();
        System.out
                .println("Item: " + shoes.getItemName() + "\t\tSize: " + shoes.getShoeSize() + "\t\tPrice: " + price);
        return price;
    }
}
