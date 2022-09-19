package structuralpatterns.bridge.example3;

import structuralpatterns.bridge.example3.implementation.PepperoniPizza;
import structuralpatterns.bridge.example3.implementation.VeggiePizza;
import structuralpatterns.bridge.example3.abstraction.AmericanRestaurant;
import structuralpatterns.bridge.example3.abstraction.ItalianRestaurant;

/**
 *
 */
public class Client {

    /*
     * Video Reference: https://youtu.be/88kAIisOiYs
     */
    public static void main(String[] args) {

        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("================================================");

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}