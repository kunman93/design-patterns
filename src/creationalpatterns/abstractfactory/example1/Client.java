package creationalpatterns.abstractfactory.example1;

import creationalpatterns.abstractfactory.example1.animalfamily.Animal;
import creationalpatterns.abstractfactory.example1.animalfamily.AnimalType;
import creationalpatterns.abstractfactory.example1.colorfamily.Color;
import creationalpatterns.abstractfactory.example1.colorfamily.ColorDesignation;
import creationalpatterns.abstractfactory.example1.factories.AbstractFactory;
import creationalpatterns.abstractfactory.example1.factories.FactoryProvider;
import creationalpatterns.abstractfactory.example1.factories.FactoryType;

/**
 * Provide an interface for creating families of related or dependent objects without
 * specifying their concrete classes.
 *
 * FactoryProvider provides the requested factory. In this example the animalFactory or the colorFactory.
 * The factories are responsible for creating the corresponding classes.
 *
 * The Client only uses the interface!
 *
 * Extending abstract factories to produce new kinds of Products isn't easy. That's because the AbstractFactory
 * interface fixes the set of products that can be created. Supporting new kinds of products requires extending the
 * factory interface, which involves changing the AbstractFactory class and all of its subclasses.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory<Animal, AnimalType> animalFactory = FactoryProvider.getFactory(FactoryType.ANIMAL_FACTORY);
        AbstractFactory<Color, ColorDesignation> colorFactory = FactoryProvider.getFactory(FactoryType.COLOR_FACTORY);

        Animal dog = animalFactory.create(AnimalType.DOG);
        Animal duck = animalFactory.create(AnimalType.DUCK);

        System.out.println(dog.getAnimalType());
        System.out.println(duck.getAnimalType());
        System.out.println(dog.makeSound());
        System.out.println(duck.makeSound());

        Color brown = colorFactory.create(ColorDesignation.BROWN);
        Color white = colorFactory.create(ColorDesignation.WHITE);

        System.out.println(brown.getColorDesignation());
        System.out.println(white.getColorDesignation());
    }
}
