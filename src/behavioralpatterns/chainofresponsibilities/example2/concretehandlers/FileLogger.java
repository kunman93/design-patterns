package behavioralpatterns.chainofresponsibilities.example2.concretehandlers;

public class FileLogger extends Logger {

    public FileLogger(Level level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
