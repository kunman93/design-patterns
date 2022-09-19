package behavioralpatterns.strategy.strategy.bellstrategie;

public class ElektronischBellen implements BellVerhalten {
    @Override
    public void bellen() {
        System.out.println("Elekkkkktronisch Bellen!");
    }
}
