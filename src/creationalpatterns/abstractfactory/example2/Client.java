package creationalpatterns.abstractfactory.example2;

import creationalpatterns.abstractfactory.example2.factory.GuiFactory;
import creationalpatterns.abstractfactory.example2.factory.MacOsGuiFactory;
import creationalpatterns.abstractfactory.example2.factory.WindowsGuiFactory;

// https://refactoring.guru/design-patterns/abstract-factory/java/example
public class Client {
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOsGuiFactory();
        } else {
            factory = new WindowsGuiFactory();
        }
        return new Application(factory);
    }
}
