package creationalpatterns.abstractfactory.example1.animalfamily;

public class Duck implements Animal{
    @Override
    public AnimalType getAnimalType() {
        return AnimalType.DUCK;
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}
