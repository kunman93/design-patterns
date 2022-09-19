package behavioralpatterns.strategy.context;

import behavioralpatterns.strategy.strategy.bellstrategie.BellVerhalten;
import behavioralpatterns.strategy.strategy.laufstrategie.LaufVerhalten;

public abstract class Hund {
    private BellVerhalten bellVerhalten;
    private LaufVerhalten laufVerhalten;

    public void setBellVerhalten(BellVerhalten bellVerhalten){
        this.bellVerhalten = bellVerhalten;
    }

    public void setLaufVerhalten(LaufVerhalten laufVerhalten){
        this.laufVerhalten = laufVerhalten;
    }

    public void bellen(){
        bellVerhalten.bellen();
    }

    public void laufen(){
        laufVerhalten.laufen();
    }

}
