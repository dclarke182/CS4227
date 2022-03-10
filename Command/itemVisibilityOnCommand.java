package Command;

class ItemVisibilityOnCommand implements Command {
    Item item;

    public ItemVisibilityOnCommand(Item item) {
        this.item = item;
    }

    public void execute() {
        item.itemVisibilityOn();
    }
    ///
}