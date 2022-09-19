package structuralpatterns.flyweight;

import structuralpatterns.flyweight.color.*;
import structuralpatterns.flyweight.factories.Factory;
import structuralpatterns.flyweight.factories.RectangleFactory;
import structuralpatterns.flyweight.factories.ShapeFactory;
import structuralpatterns.flyweight.shape.Circle;
import structuralpatterns.flyweight.shape.Rectangle;
import structuralpatterns.flyweight.shape.Shape;
import structuralpatterns.flyweight.shape.ShapeType;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.
 */
public class FlyWeightPatternDemo {

    public static void main(String[] args) {
        // a new red circle object will be created. The created object will be stored in a HashMap in the ShapeFactory-class
        Circle circle1 = (Circle) ShapeFactory.getShape(ShapeType.CIRCLE, ColorChoice.RED);
        circle1.setX(1);
        circle1.setY(2);
        circle1.setRadius(3);
        circle1.draw();

        // a red circle object will be loaded from the HashMap in the ShapeFactory-class, because it has been created previously
        Circle circle2 = (Circle) ShapeFactory.getShape(ShapeType.CIRCLE, ColorChoice.RED);
        circle2.setX(4);
        circle2.setY(5);
        circle2.setRadius(6);
        circle2.draw();

        // a new blue circle object will be created. The created object will be stored in a HashMap in the ShapeFactory-class
        Circle circle3 = (Circle) ShapeFactory.getShape(ShapeType.CIRCLE, ColorChoice.BLUE);
        circle3.setX(7);
        circle3.setY(8);
        circle3.setRadius(9);
        circle3.draw();

        // a new green circle object will be created. The created object will be stored in a HashMap in the ShapeFactory-class
        Rectangle rectangle1 = (Rectangle) ShapeFactory.getShape(ShapeType.RECTANGLE, ColorChoice.GREEN);
        rectangle1.setHeight(10);
        rectangle1.setWidth(11);
        rectangle1.draw();

        // a green circle object will be loaded from the HashMap in the ShapeFactory-class because it has been created previously
        Rectangle rectangle2 = (Rectangle) ShapeFactory.getShape(ShapeType.RECTANGLE, ColorChoice.GREEN);
        rectangle2.setHeight(12);
        rectangle2.setWidth(13);
        rectangle2.draw();

    }
}
