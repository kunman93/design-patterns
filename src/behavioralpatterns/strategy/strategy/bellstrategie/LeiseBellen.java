package behavioralpatterns.strategy.strategy.bellstrategie;

public class LeiseBellen implements BellVerhalten {
    @Override
    public void bellen() {
        System.out.println("ganz leise bellen...");
    }
}