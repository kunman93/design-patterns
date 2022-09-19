package behavioralpatterns.observer.concretesubject;

import behavioralpatterns.observer.Message;
import behavioralpatterns.observer.observer.Subscriber;
import behavioralpatterns.observer.subject.Publisher;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject implements Subject called Publisher
 */
public class MessagePublisher implements Publisher {

    private final List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyUpdate(Message message) {
        subscribers.forEach(subscriber -> subscriber.update(message));
    }
}
