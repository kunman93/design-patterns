package behavioralpatterns.command.command;

import behavioralpatterns.command.receiver.Device;

public class TurnDeviceVolumeDownCommand implements Command {

    private final Device device;

    public TurnDeviceVolumeDownCommand(Device device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
