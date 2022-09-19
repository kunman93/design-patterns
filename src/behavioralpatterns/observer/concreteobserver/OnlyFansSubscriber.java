package behavioralpatterns.observer.concreteobserver;

import behavioralpatterns.observer.Message;
import behavioralpatterns.observer.observer.Subscriber;

/**
 * ConcreteObserver implements the Observer called Subscriber.
 */
public class OnlyFansSubscriber implements Subscriber {
    @Override
    public void update(Message message) {
        System.out.println("OnlyFansSubscriber :: " + message.getMessageContent());
    }
}
