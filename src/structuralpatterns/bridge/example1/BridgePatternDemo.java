package structuralpatterns.bridge.example1;

import structuralpatterns.bridge.example1.implementation.Blue;
import structuralpatterns.bridge.example1.implementation.Red;
import structuralpatterns.bridge.example1.abstraction.Shape;
import structuralpatterns.bridge.example1.abstraction.Square;
import structuralpatterns.bridge.example1.abstraction.Triangle;

/**
 * For the Bridge pattern, we'll consider two layers of abstraction; one is the geometric shape (like triangle and square)
 * which is filled with different colors (our second abstraction layer): Check out the jpg image to understand the pattern.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape square = new Square();

        triangle.setColor(new Blue());
        square.setColor(new Red());

        triangle.draw();
        square.draw();
    }
}
