package creationalpatterns.factorymethods.simplefactoryexample1;

import creationalpatterns.factorymethods.simplefactoryexample1.notification.EmailNotification;
import creationalpatterns.factorymethods.simplefactoryexample1.notification.Notification;
import creationalpatterns.factorymethods.simplefactoryexample1.notification.PushNotification;
import creationalpatterns.factorymethods.simplefactoryexample1.notification.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(NotificationType notificationType){
        return switch (notificationType){
            case SMS -> new SMSNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}
