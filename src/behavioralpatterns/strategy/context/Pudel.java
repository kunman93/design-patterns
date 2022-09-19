package behavioralpatterns.strategy.context;

import behavioralpatterns.strategy.strategy.bellstrategie.LeiseBellen;
import behavioralpatterns.strategy.strategy.laufstrategie.NormalLaufen;

public class Pudel extends Hund {

    public Pudel(){
        setBellVerhalten(new LeiseBellen());
        setLaufVerhalten(new NormalLaufen());
    }
}
