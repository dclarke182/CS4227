package Command;

public class Output {
    public static void main(String[] args) {

        ItemSettings setting = new ItemSettings();
        Item clothing = new Item("Hoodie", 30.00);

        ItemVisibilityOnCommand visibilityOn = new ItemVisibilityOnCommand(clothing);
        ItemVisibilityOffCommand visibilityOff = new ItemVisibilityOffCommand(clothing);

        setting.setCommand(visibilityOn);
        setting.settingChange();

        setting.setCommand(visibilityOff);
        setting.settingChange();
        ///
    }
}
