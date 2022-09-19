package behavioralpatterns.strategy.strategy.laufstrategie;

public class SchnellLaufen implements LaufVerhalten {
    @Override
    public void laufen() {
        System.out.println("Schnell laufen.");
    }
}