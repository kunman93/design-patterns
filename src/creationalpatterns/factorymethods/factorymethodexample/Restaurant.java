package creationalpatterns.factorymethods.factorymethodexample;

import creationalpatterns.factorymethods.factorymethodexample.burger.Burger;

// Abstract class with factory method createBurger
public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
