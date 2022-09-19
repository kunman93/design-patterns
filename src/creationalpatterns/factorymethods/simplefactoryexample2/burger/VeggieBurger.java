package creationalpatterns.factorymethods.simplefactoryexample2.burger;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Prepare Veggie Burger...");
    }
}
