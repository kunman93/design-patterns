package creationalpatterns.factorymethods.simplefactoryexample2;

import creationalpatterns.factorymethods.simplefactoryexample2.burger.Burger;

// https://www.youtube.com/watch?v=EdFq_JIThqM&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=3
public class Client {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Burger beefBurger = restaurant.orderBurger(RequestType.BEEF);
        Burger veggieBurger = restaurant.orderBurger(RequestType.VEGGIE);
    }
}
