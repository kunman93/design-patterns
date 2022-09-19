package behavioralpatterns.command.command;

import behavioralpatterns.command.receiver.Device;

public class TurnDeviceVolumeUpCommand implements Command {

    private final Device device;

    public TurnDeviceVolumeUpCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
