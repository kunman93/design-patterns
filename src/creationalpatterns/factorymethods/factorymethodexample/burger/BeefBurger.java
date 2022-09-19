package creationalpatterns.factorymethods.factorymethodexample.burger;

public class BeefBurger implements Burger {
    private boolean isPrepared;

    @Override
    public void prepare() {
        System.out.println("Prepare Beef Burger...");
        isPrepared = true;
    }

    public boolean isPrepared() {
        return isPrepared;
    }
}
