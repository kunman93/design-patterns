package structuralpatterns.flyweight.factories;

import structuralpatterns.flyweight.color.Color;
import structuralpatterns.flyweight.color.ColorChoice;
import structuralpatterns.flyweight.shape.Circle;
import structuralpatterns.flyweight.shape.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape(ColorChoice colorChoice) {

        AbstractColorFactory<Color, ColorChoice> colorFactory = (AbstractColorFactory) FACTORY_PROVIDER.getFactory(FactoryType.COLOR_FACTORY);

        return new Circle(colorFactory.createColor(colorChoice));
    }
}
