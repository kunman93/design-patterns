package creationalpatterns.abstractfactory.example1.animalfamily;

public class Dog implements Animal{
    @Override
    public AnimalType getAnimalType() {
        return AnimalType.DOG;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
