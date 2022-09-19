package behavioralpatterns.strategy.strategy.bellstrategie;

public class LautBellen implements BellVerhalten{
    @Override
    public void bellen() {
        System.out.println("GANZ LAUT BELLEN!!");
    }
}
