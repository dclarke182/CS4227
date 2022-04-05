package Visitor;

public class Shoes implements Item {

    String itemName;
    int shoeSize;
    double price;

    public Shoes(String itemName, int shoeSize, double price) {
        this.itemName = itemName;
        this.shoeSize = shoeSize;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}//
