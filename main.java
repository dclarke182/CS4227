import java.util.List;
import Inventory.*;

public class main {
   public static void main(String args[]) {
      InventoryStock item1 = new Item("item1");
      InventoryStock item2 = new Item("item2");
      InventoryStock item3 = new Item("item3");
      InventoryStock item4 = new Item("item4");

      ItemType Itemtype1 = new ItemType("Type 1", List.of(item3, item4));
      ItemType Itemtype2 = new ItemType("Type 2", List.of(item1));

      ItemType data = new ItemType("data", List.of(Itemtype1, Itemtype2));
      data.print();
   }
}

