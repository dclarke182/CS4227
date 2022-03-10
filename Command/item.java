package Command;

class Item {
    String name;

    public Item(String itemName) {
        name = itemName;
    }

    public void itemVisibilityOn() {
        System.out.println(name + " is now visible");
    }

    public void itemVisibilityOff() {
        System.out.println(name + " is now invisible");
    }
    ///
}