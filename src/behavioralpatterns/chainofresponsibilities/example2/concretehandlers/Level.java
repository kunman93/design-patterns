package behavioralpatterns.chainofresponsibilities.example2.concretehandlers;

public enum Level {
    INFO(1), DEBUG(2), ERROR(3);

    private final int level;

    private Level(int level){
        this.level = level;
    }

    public int getLevelValue() {
        return level;
    }
}
