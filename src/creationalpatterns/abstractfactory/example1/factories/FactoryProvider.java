package creationalpatterns.abstractfactory.example1.factories;

public class FactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType){
        return switch(factoryType){
            case COLOR_FACTORY -> new ColorFactory();
            case ANIMAL_FACTORY -> new AnimalFactory();
        };
    }
}