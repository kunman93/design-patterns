package creationalpatterns.abstractfactory.example2.factory;

import creationalpatterns.abstractfactory.example2.button.Button;
import creationalpatterns.abstractfactory.example2.button.MacOsButton;
import creationalpatterns.abstractfactory.example2.checkbox.Checkbox;
import creationalpatterns.abstractfactory.example2.checkbox.MacOsCheckbox;

public class MacOsGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckbox();
    }
}
