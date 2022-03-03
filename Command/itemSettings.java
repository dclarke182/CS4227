package Command;

class ItemSettings {
    Command command;

    public ItemSettings() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void settingChange() {
        command.execute();
    }
    //
}