package Command;

public class output {
    public static void main(String[] args) {

        ItemSettings setting = new ItemSettings();
        Item clothing = new Item("Hoodie");

        ItemVisibilityOnCommand visibilityOn = new ItemVisibilityOnCommand(clothing);
        ItemVisibilityOffCommand visibilityOff = new ItemVisibilityOffCommand(clothing);

        setting.setCommand(visibilityOn);
        setting.settingChange();

        setting.setCommand(visibilityOff);
        setting.settingChange();
        ///
    }
}
