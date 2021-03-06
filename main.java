import java.util.List;

import InventoryComposite.InventoryStock;
import InventoryComposite.Item;
import InventoryComposite.ItemType;

public class main {
   public static void main(String args[]) {
      InventoryStock item1 = new Item("Red Shirt", "S");
      InventoryStock item2 = new Item("Blue Shirt", "L");
      InventoryStock item3 = new Item("Jeans", "M");
      InventoryStock item4 = new Item("Joggers", "S");

      ItemType Itemtype1 = new ItemType("Pants", List.of(item3, item4));
      ItemType Itemtype2 = new ItemType("Shirts", List.of(item1, item2));

      ItemType data = new ItemType("Stock", List.of(Itemtype1, Itemtype2));
      data.print();

      System.out.println("Total Number of Pants available - " + Itemtype1.getTotalNumberOfItems());

      
   }
}

