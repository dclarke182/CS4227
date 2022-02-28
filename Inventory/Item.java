package Inventory;
public class Item implements InventoryStock {
    private final String itemName;

    public Item(String itemName){
        this.itemName = itemName;
    }

    @Override
    public void print(){
        System.out.println(itemName);
    }
}
