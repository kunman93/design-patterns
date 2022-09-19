package behavioralpatterns.strategy.strategy.laufstrategie;

public class KannNichtLaufen implements LaufVerhalten{
    @Override
    public void laufen() {
        System.out.println("Kann doch gar nicht laufen.");
    }
}