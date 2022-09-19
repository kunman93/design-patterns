package creationalpatterns.abstractfactory.example1.factories;

public interface AbstractFactory<T,U> {
    T create(U familyType);
}
