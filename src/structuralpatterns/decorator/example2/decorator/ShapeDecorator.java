package structuralpatterns.decorator.example2.decorator;

import structuralpatterns.decorator.example2.Shape;

public class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
    }
}
