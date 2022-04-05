package Visitor;

public class Clothing implements Item {

    String itemName;
    String clothingSize;
    double price;

    public Clothing(String itemName, String clothingSize, double price) {
        this.itemName = itemName;
        this.clothingSize = clothingSize;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getClothingSize() {
        return clothingSize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
