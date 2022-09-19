package creationalpatterns.abstractfactory.example2;

import creationalpatterns.abstractfactory.example2.button.Button;
import creationalpatterns.abstractfactory.example2.checkbox.Checkbox;
import creationalpatterns.abstractfactory.example2.factory.GuiFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
