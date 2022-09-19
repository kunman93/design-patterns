package structuralpatterns.decorator.example2.decorator;

import structuralpatterns.decorator.example2.Shape;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();

    }

    private void setRedBorder() {
        // Display message whenever function is called
        System.out.println("Border Color: Red");
    }
}
