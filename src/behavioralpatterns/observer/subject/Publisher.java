package behavioralpatterns.observer.subject;

import behavioralpatterns.observer.Message;
import behavioralpatterns.observer.observer.Subscriber;

/**
 * Subject can attach, detach, notifyUpdate observers.
 */
public interface Publisher {
    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void notifyUpdate(Message message);
}
