package behavioralpatterns.chainofresponsibilities.example2.concretehandlers;

public class ErrorLogger extends Logger {

    public ErrorLogger(Level level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
