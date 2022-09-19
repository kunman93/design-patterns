package behavioralpatterns.strategy.context;

import behavioralpatterns.strategy.strategy.bellstrategie.LeiseBellen;
import behavioralpatterns.strategy.strategy.laufstrategie.SchnellLaufen;

public class Husky extends Hund {

    public Husky(){
        setBellVerhalten(new LeiseBellen());
        setLaufVerhalten(new SchnellLaufen());
    }
}
