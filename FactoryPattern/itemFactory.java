package FactoryPattern;

public class itemFactory {
    //use getItem method to get object of type shape
    public item getItem(String ItemType){
        if(ItemType == null){
            return null;
        }
        if(ItemType.equalsIgnoreCase("bag")){
            return new bag();

        } else if(ItemType.equalsIgnoreCase("hat")){
            return new hat();

        } else if(ItemType.equalsIgnoreCase("shoes")){
            return new shoes();
        }

        return null;
    }
}
