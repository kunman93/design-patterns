package creationalpatterns.factorymethods.simplefactoryexample2;

import creationalpatterns.factorymethods.simplefactoryexample2.burger.Burger;

public class Restaurant {
    public Burger orderBurger(RequestType requestType) {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger = burgerFactory.createBurger(requestType);
        burger.prepare();
        return burger;
    }
}
