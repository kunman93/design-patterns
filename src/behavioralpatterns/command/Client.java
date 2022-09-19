package behavioralpatterns.command;

import behavioralpatterns.command.invoker.*;
import behavioralpatterns.command.receiver.Device;
import behavioralpatterns.command.receiver.Radio;
import behavioralpatterns.command.receiver.Television;

/**
 * In a classic implementation, the command pattern requires implementing four components: the Command, the Receiver,
 * the Invoker, and the Client.
 *
 * The Command pattern turns the request itself into an object. This object can be stored and passed around like other objects.
 * The key to this pattern is a Command interface, which declares an interface for executing operations. In its simplest form,
 * this interface includes an abstract execute operation.
 */
public class Client {

    public static void main(String[] args) {

        Device television = new Television();
        Device radio = new Radio();

        Remote tvRemote = new TVRemote();
        Remote radioRemote = new RadioRemote();

        try {
            tvRemote.connectDeviceToRemote(television);
            radioRemote.connectDeviceToRemote(radio);
        } catch (IncorrectDeviceException e) {
            e.printStackTrace();
        }

        tvRemote.turnDeviceOn();
        tvRemote.turnDeviceOff();
        tvRemote.turnDeviceVolumeUp();
        tvRemote.turnDeviceVolumeDown();

        radioRemote.turnDeviceOn();
        radioRemote.turnDeviceOff();
        radioRemote.turnDeviceVolumeUp();
        radioRemote.turnDeviceVolumeDown();
    }
}
