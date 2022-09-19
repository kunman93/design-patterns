package structuralpatterns.flyweight.factories;

public interface AbstractShapeFactory<T,U> extends Factory {
    T createShape(U u);
}
