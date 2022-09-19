package structuralpatterns.decorator.example2;

import structuralpatterns.decorator.example2.decorator.RedShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redShapeDecorator = new RedShapeDecorator(circle);

        redShapeDecorator.draw();

        redShapeDecorator = new RedShapeDecorator(rectangle);

        redShapeDecorator.draw();
    }
}
