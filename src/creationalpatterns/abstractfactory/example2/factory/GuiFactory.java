package creationalpatterns.abstractfactory.example2.factory;

import creationalpatterns.abstractfactory.example2.button.Button;
import creationalpatterns.abstractfactory.example2.checkbox.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
