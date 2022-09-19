package structuralpatterns.flyweight.factories;

public class FactoryProvider {

    public Factory getFactory(FactoryType factoryType){
        return switch(factoryType){
            case COLOR_FACTORY -> new ColorFactory();
            case CIRCLE_FACTORY -> new CircleFactory();
            case RECTANGLE_FACTORY -> new RectangleFactory();
        };
    }
}
