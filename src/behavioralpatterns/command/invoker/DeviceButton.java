package behavioralpatterns.command.invoker;

import behavioralpatterns.command.command.Command;

public class DeviceButton {

    private final Command command;

    public DeviceButton(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
