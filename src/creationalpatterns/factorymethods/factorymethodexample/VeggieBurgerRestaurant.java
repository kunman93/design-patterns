package creationalpatterns.factorymethods.factorymethodexample;

import creationalpatterns.factorymethods.factorymethodexample.burger.Burger;
import creationalpatterns.factorymethods.factorymethodexample.burger.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
