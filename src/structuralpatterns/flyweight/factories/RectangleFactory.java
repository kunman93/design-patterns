package structuralpatterns.flyweight.factories;

import structuralpatterns.flyweight.color.Color;
import structuralpatterns.flyweight.color.ColorChoice;
import structuralpatterns.flyweight.shape.Rectangle;
import structuralpatterns.flyweight.shape.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape(ColorChoice colorChoice) {

        AbstractColorFactory<Color, ColorChoice> colorFactory = (AbstractColorFactory) FACTORY_PROVIDER.getFactory(FactoryType.COLOR_FACTORY);

        return new Rectangle(colorFactory.createColor(colorChoice));
    }
}
