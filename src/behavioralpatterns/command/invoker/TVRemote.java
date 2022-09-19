package behavioralpatterns.command.invoker;

import behavioralpatterns.command.receiver.Device;
import behavioralpatterns.command.receiver.Television;

public class TVRemote extends Remote {
    @Override
    public void connectDeviceToRemote(Device television) throws IncorrectDeviceException {
        if(!(television instanceof Television)){
            throw new IncorrectDeviceException("Connection aborted!");
        }
        this.device = television;
        initializeTVButtons();
    }
}
