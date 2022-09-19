package behavioralpatterns.command.receiver;

public interface Device {
    void on();

    void off();

    void volumeUp();

    void volumeDown();
}
