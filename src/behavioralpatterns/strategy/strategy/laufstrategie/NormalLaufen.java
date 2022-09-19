package behavioralpatterns.strategy.strategy.laufstrategie;

public class NormalLaufen implements LaufVerhalten{
    @Override
    public void laufen() {
        System.out.println("Normal laufen.");
    }
}