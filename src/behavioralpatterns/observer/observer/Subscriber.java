package behavioralpatterns.observer.observer;

import behavioralpatterns.observer.Message;

/**
 * Observer will be updated when Subject invokes notifyUpdate.
 */
public interface Subscriber {
    void update(Message message);
}
