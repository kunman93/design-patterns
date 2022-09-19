package creationalpatterns.factorymethods.simplefactoryexample1;

import creationalpatterns.factorymethods.simplefactoryexample1.notification.Notification;

/**
 * In the above class diagram we have an interface called Notification, and three concrete classes are implementing Notification interface.
 * A factory class NotificationFactory is created to get a Notification object.
 */
public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification smsNotification = notificationFactory.createNotification(NotificationType.SMS);
        Notification emailNotification = notificationFactory.createNotification(NotificationType.EMAIL);
        Notification pushNotification = notificationFactory.createNotification(NotificationType.PUSH);

        smsNotification.notifyUser();
        emailNotification.notifyUser();
        pushNotification.notifyUser();
    }
}
