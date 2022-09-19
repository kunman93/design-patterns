package behavioralpatterns.command.invoker;

import behavioralpatterns.command.receiver.Device;
import behavioralpatterns.command.receiver.Radio;

public class RadioRemote extends Remote {
    @Override
    public void connectDeviceToRemote(Device radio) throws IncorrectDeviceException {
        if(!(radio instanceof Radio)){
            throw new IncorrectDeviceException("Connection aborted!");
        }
        this.device = radio;
        initializeTVButtons();
    }
}
