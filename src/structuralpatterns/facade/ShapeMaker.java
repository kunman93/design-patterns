package structuralpatterns.facade;

import structuralpatterns.facade.shape.Circle;
import structuralpatterns.facade.shape.Rectangle;
import structuralpatterns.facade.shape.Shape;
import structuralpatterns.facade.shape.Square;

/**
 * Facade containing the different shapes.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
