package behavioralpatterns.strategy.context;

import behavioralpatterns.strategy.strategy.bellstrategie.LautBellen;
import behavioralpatterns.strategy.strategy.laufstrategie.NormalLaufen;

public class Bulldogge extends Hund {

    public Bulldogge(){
        setBellVerhalten(new LautBellen());
        setLaufVerhalten(new NormalLaufen());
    }
}
