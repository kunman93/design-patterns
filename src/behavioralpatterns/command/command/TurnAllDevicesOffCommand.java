package behavioralpatterns.command.command;

import behavioralpatterns.command.receiver.Device;

import java.util.List;

public class TurnAllDevicesOffCommand implements Command {

    private final List<Device> devices;

    public TurnAllDevicesOffCommand(List<Device> devices){
        this.devices = devices;
    }

    @Override
    public void execute() {
        devices.forEach(Device::off);
    }

    @Override
    public void undo() {
        devices.forEach(Device::on);
    }
}
