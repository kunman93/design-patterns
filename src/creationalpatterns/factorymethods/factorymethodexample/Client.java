package creationalpatterns.factorymethods.factorymethodexample;

import creationalpatterns.factorymethods.factorymethodexample.burger.Burger;

// https://www.youtube.com/watch?v=EdFq_JIThqM&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=3
public class Client {
    public static void main(String[] args) {
        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();

        Burger beefBurger = beefBurgerRestaurant.orderBurger();
        Burger veggieBurger = veggieBurgerRestaurant.orderBurger();

        System.out.println("Beef Burger is prepared " + beefBurger.isPrepared());
        System.out.println("Veggie Burger is prepared " + veggieBurger.isPrepared());
    }
}
