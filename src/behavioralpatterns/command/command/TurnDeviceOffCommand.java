package behavioralpatterns.command.command;

import behavioralpatterns.command.receiver.Device;

public class TurnDeviceOffCommand implements Command {

    private final Device device;

    public TurnDeviceOffCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
