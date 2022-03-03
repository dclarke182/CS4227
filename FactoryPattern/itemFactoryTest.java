package FactoryPattern;

public class itemFactoryTest {
    public static void main(String[] args) {
        itemFactory itemFactory = new itemFactory();

        //get an object of Circle and call its draw method.
        item item1 = itemFactory.getItem("bag");

        //call draw method of Circle
        item1.addItem();

        //get an object of Rectangle and call its draw method.
        item item2 = itemFactory.getItem("hat");

        //call draw method of Rectangle
        item2.addItem();

        //get an object of Square and call its draw method.
        item item3 = itemFactory.getItem("shoes");

        //call draw method of square
        item3.addItem();
    }
}
