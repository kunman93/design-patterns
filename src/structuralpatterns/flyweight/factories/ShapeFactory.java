package structuralpatterns.flyweight.factories;

import structuralpatterns.flyweight.color.ColorChoice;
import structuralpatterns.flyweight.shape.Shape;
import structuralpatterns.flyweight.shape.ShapeType;

import java.util.HashMap;
import java.util.Map;

public abstract class ShapeFactory implements AbstractShapeFactory<Shape, ColorChoice> {
    protected static final FactoryProvider FACTORY_PROVIDER = new FactoryProvider();

    private static final Map<ShapeType, ColorChoice> SHAPE_TYPE_AND_COLOR_CHOICE_MAP = new HashMap<>();
    private static final Map<Map<ShapeType, ColorChoice>, Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(ShapeType shapeType, ColorChoice colorChoice){

        SHAPE_TYPE_AND_COLOR_CHOICE_MAP.put(shapeType, colorChoice);
        Shape shape = SHAPE_MAP.get(SHAPE_TYPE_AND_COLOR_CHOICE_MAP);

        if(shape == null){
            ShapeFactory shapeFactory = null;
            switch (shapeType){
                case CIRCLE -> {
                    shapeFactory = (CircleFactory) FACTORY_PROVIDER.getFactory(FactoryType.CIRCLE_FACTORY);
                    System.out.println("Creating a " + colorChoice + " " + shapeType);
                }
                case RECTANGLE -> {
                    shapeFactory = (RectangleFactory) FACTORY_PROVIDER.getFactory(FactoryType.RECTANGLE_FACTORY);
                    System.out.println("Creating a " + colorChoice + " " + shapeType);
                }
            }

            shape = shapeFactory.createShape(colorChoice);
            SHAPE_MAP.put(SHAPE_TYPE_AND_COLOR_CHOICE_MAP, shape);
        }else{
            System.out.println("Shape exists");
        }

        return shape;
    }
}
