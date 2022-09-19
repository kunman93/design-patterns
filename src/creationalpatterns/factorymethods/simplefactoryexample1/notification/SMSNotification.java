package creationalpatterns.factorymethods.simplefactoryexample1.notification;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
