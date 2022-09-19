package creationalpatterns.abstractfactory.example1.factories;

import creationalpatterns.abstractfactory.example1.animalfamily.Animal;
import creationalpatterns.abstractfactory.example1.animalfamily.AnimalType;
import creationalpatterns.abstractfactory.example1.animalfamily.Dog;
import creationalpatterns.abstractfactory.example1.animalfamily.Duck;

public class AnimalFactory implements AbstractFactory<Animal,AnimalType>{
    @Override
    public Animal create(AnimalType animalType) {
        return switch (animalType) {
            case DOG -> new Dog();
            case DUCK -> new Duck();
        };
    }
}
