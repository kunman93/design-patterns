package structuralpatterns.bridge.example2;

import structuralpatterns.bridge.example2.implementation.GreenCircle;
import structuralpatterns.bridge.example2.abstraction.Circle;
import structuralpatterns.bridge.example2.abstraction.Shape;

/**
 * We have a DrawAPI interface which is acting as a bridge implementer and concrete classes RedCircle, GreenCircle
 * implementing the DrawAPI interface. Shape is an abstract class and will use object of DrawAPI. BridgePatternDemo,
 * our demo class will use Shape class to draw different colored circle.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape greenCircle = new Circle(10,10,100, new GreenCircle());
        greenCircle.drawCircle();
    }
}
