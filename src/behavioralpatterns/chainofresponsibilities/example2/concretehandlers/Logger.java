package behavioralpatterns.chainofresponsibilities.example2.concretehandlers;

public abstract class Logger {

    private Logger nextLogger;

    protected Level level;

    public void setNextLogger(Logger logger){
        this.nextLogger = logger;
    }

    public void logMessage(Level level, String message){
        if(this.level.getLevelValue() <= level.getLevelValue()){
            this.write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String message);
}
