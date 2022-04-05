package Command;

class Item {
    String name;
    double price;

    public Item(String itemName, double itemPrice) {
        name = itemName;
        price = itemPrice;
    }

    public void itemVisibilityOn() {
        System.out.println(name + " is visible");
    }

    public void itemVisibilityOff() {
        System.out.println(name + " is invisible");
    }

}