package structuralpatterns.flyweight.factories;

public interface AbstractColorFactory<T,U> extends Factory {
    T createColor(U u);
}
