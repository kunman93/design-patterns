package creationalpatterns.factorymethods.simplefactoryexample2.burger;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Prepare Beef Burger...");
    }
}
