package behavioralpatterns.observer.concreteobserver;

import behavioralpatterns.observer.Message;
import behavioralpatterns.observer.observer.Subscriber;

/**
 * ConcreteObserver implements the Observer called Subscriber.
 */
public class RedditSubscriber implements Subscriber {
    @Override
    public void update(Message message) {
        System.out.println("RedditSubscriber :: " + message.getMessageContent());
    }
}
