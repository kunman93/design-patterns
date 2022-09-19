package behavioralpatterns.templatemethod;

public abstract class Game {

    //template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
        applaudTheTeamsEffort();
    }

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    private void applaudTheTeamsEffort(){
        System.out.println("Well done Team!");
    }


}
