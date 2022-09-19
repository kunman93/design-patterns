package behavioralpatterns.chainofresponsibilities.example2.concretehandlers;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Level level){
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
