package behavioralpatterns.observer.concreteobserver;

import behavioralpatterns.observer.Message;
import behavioralpatterns.observer.observer.Subscriber;

/**
 * ConcreteObserver implements the Observer called Subscriber.
 */
public class YouTubeSubscriber implements Subscriber {
    @Override
    public void update(Message message) {
        System.out.println("YouTubeSubscriber :: " + message.getMessageContent());
    }
}
