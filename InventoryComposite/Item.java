package InventoryComposite;

public class Item implements InventoryStock {
    private final String itemName;
    private final String itemSize;

    public Item(String itemName, String itemSize){
        this.itemName = itemName;
        this.itemSize = itemSize;  

        
    }

    @Override
    public void print(){
        System.out.println(itemName + " - Size: (" + itemSize + ")");
    }
}
