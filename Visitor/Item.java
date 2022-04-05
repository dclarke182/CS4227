package Visitor;

public interface Item {
    public double accept(ShoppingCartVisitor visitor);
}
