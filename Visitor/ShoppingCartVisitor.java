package Visitor;

public interface ShoppingCartVisitor {
    double visit(Clothing clothing);

    double visit(Shoes shoes);
}
