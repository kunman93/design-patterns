package structuralpatterns.adapter.example1;

/**
 * Let’s assume that you are short on ToyDuck objects and you would like to use Bird objects in their place.
 * Birds have some similar functionality but implement a different interface, so we can’t use them directly.
 * So we will use adapter pattern. Here our client would be ToyDuck and adaptee would be Bird.
 *
 * Adaptee (Bird)
 * - defines an existing interface that needs adapting.
 *
 * Adapter (BirdAdapter)
 * - adapts the interface of Adaptee (Bird) to the Target interface (ToyDuck).
 *
 */
public class AdapterDemo {
    public static void main(String[] args){
        Bird sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        // Wrap a bird in a birdAdapter so that it behaves like a toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("birdAdapter...");
        birdAdapter.squeak();


    }
}
