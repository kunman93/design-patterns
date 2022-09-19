package behavioralpatterns.strategy.context;

import behavioralpatterns.strategy.strategy.bellstrategie.ElektronischBellen;
import behavioralpatterns.strategy.strategy.laufstrategie.KannNichtLaufen;

public class HundAttrappe extends Hund {

    public HundAttrappe(){
        setBellVerhalten(new ElektronischBellen());
        setLaufVerhalten(new KannNichtLaufen());
    }
}
