package creationalpatterns.factorymethods.factorymethodexample.burger;

public class VeggieBurger implements Burger {
    private boolean isPrepared;

    @Override
    public void prepare() {
        System.out.println("Prepare Veggie Burger...");
        isPrepared = true;
    }

    public boolean isPrepared() {
        return isPrepared;
    }
}
