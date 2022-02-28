package Inventory;
import java.util.ArrayList;
import java.util.List;

public class ItemType implements InventoryStock {
    private final String ItemCatagory;
    private final List<InventoryStock> items;

    public ItemType(String ItemCatagory, List<InventoryStock> items) {
        this.ItemCatagory = ItemCatagory;
        this.items = new ArrayList<>(items);
    }

    public void addItem(InventoryStock item) {
        this.items.add(item);
    }
    public void removeItem(InventoryStock item) {
        this.items.add(item);
    }
    public InventoryStock getItem(int position) {
        if (position < 0 || position >= items.size()) {
            throw new RuntimeException("Invalid position " + position);
        }
        return items.get(position);
    }
    
    private int getTotalNumberOfItems() {
        return items.size();
    }

    @Override
    public void print() {

    }
}