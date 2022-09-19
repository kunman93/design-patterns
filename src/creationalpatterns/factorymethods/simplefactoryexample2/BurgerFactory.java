package creationalpatterns.factorymethods.simplefactoryexample2;

import creationalpatterns.factorymethods.simplefactoryexample2.burger.BeefBurger;
import creationalpatterns.factorymethods.simplefactoryexample2.burger.Burger;
import creationalpatterns.factorymethods.simplefactoryexample2.burger.VeggieBurger;

public class BurgerFactory {
    public Burger createBurger(RequestType requestType){
        return switch (requestType){
            case BEEF -> new BeefBurger();
            case VEGGIE -> new VeggieBurger();
        };
    }
}
