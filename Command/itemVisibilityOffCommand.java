package Command;

class ItemVisibilityOffCommand implements Command {
    Item item;

    public ItemVisibilityOffCommand(Item item) {
        this.item = item;
    }

    public void execute() {
        item.itemVisibilityOff();
    }
    //
}