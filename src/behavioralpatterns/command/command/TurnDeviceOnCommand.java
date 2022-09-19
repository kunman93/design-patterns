package behavioralpatterns.command.command;

import behavioralpatterns.command.receiver.Device;

public class TurnDeviceOnCommand implements Command {

    private final Device device;

    public TurnDeviceOnCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
