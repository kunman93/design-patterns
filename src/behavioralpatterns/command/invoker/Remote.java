package behavioralpatterns.command.invoker;

import behavioralpatterns.command.command.TurnDeviceOffCommand;
import behavioralpatterns.command.command.TurnDeviceOnCommand;
import behavioralpatterns.command.command.TurnDeviceVolumeDownCommand;
import behavioralpatterns.command.command.TurnDeviceVolumeUpCommand;
import behavioralpatterns.command.receiver.Device;

import java.util.HashMap;
import java.util.Map;

public abstract class Remote {
    protected Device device;
    private final Map<ButtonLabel,DeviceButton> deviceLabelAndButtonsMap = new HashMap<>();

    protected void initializeTVButtons() {
        deviceLabelAndButtonsMap.put(ButtonLabel.ON, new DeviceButton(new TurnDeviceOnCommand(device)));
        deviceLabelAndButtonsMap.put(ButtonLabel.OFF,new DeviceButton(new TurnDeviceOffCommand(device)));
        deviceLabelAndButtonsMap.put(ButtonLabel.VOLUME_UP,new DeviceButton(new TurnDeviceVolumeUpCommand(device)));
        deviceLabelAndButtonsMap.put(ButtonLabel.VOLUME_DOWN, new DeviceButton(new TurnDeviceVolumeDownCommand(device)));
    }

    public abstract void connectDeviceToRemote(Device device) throws IncorrectDeviceException;

    public void turnDeviceOn(){
        if(device != null) {
            deviceLabelAndButtonsMap.get(ButtonLabel.ON).press();
        }else{
            System.out.println("The remote is not connected with the TV. Please connect!");
        }
    }

    public void turnDeviceOff(){
        if(device != null){
            deviceLabelAndButtonsMap.get(ButtonLabel.OFF).press();
        }else{
            System.out.println("The remote is not connected with the TV. Please connect!");
        }

    }

    public void turnDeviceVolumeUp(){
        if(device != null){
            deviceLabelAndButtonsMap.get(ButtonLabel.VOLUME_UP).press();

        }else{
            System.out.println("The remote is not connected with the TV. Please connect!");
        }
    }

    public void turnDeviceVolumeDown() {
        if(device != null){
            deviceLabelAndButtonsMap.get(ButtonLabel.VOLUME_DOWN).press();
        }else{
            System.out.println("The remote is not connected with the TV. Please connect!");
        }
    }
}
