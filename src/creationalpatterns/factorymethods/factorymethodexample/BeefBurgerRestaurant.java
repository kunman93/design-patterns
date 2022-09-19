package creationalpatterns.factorymethods.factorymethodexample;

import creationalpatterns.factorymethods.factorymethodexample.burger.BeefBurger;
import creationalpatterns.factorymethods.factorymethodexample.burger.Burger;

public class BeefBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
