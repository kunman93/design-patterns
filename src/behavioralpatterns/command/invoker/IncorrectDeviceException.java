package behavioralpatterns.command.invoker;

public class IncorrectDeviceException extends Exception {
    public IncorrectDeviceException(String errorMessage){
        super(errorMessage);
    }
}
