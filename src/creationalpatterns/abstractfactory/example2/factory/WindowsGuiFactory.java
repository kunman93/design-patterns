package creationalpatterns.abstractfactory.example2.factory;

import creationalpatterns.abstractfactory.example2.button.Button;
import creationalpatterns.abstractfactory.example2.button.WindowsButton;
import creationalpatterns.abstractfactory.example2.checkbox.Checkbox;
import creationalpatterns.abstractfactory.example2.checkbox.WindowsCheckbox;

public class WindowsGuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
