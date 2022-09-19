package behavioralpatterns.observer;

import behavioralpatterns.observer.concreteobserver.OnlyFansSubscriber;
import behavioralpatterns.observer.concreteobserver.RedditSubscriber;
import behavioralpatterns.observer.concreteobserver.YouTubeSubscriber;
import behavioralpatterns.observer.concretesubject.MessagePublisher;
import behavioralpatterns.observer.observer.Subscriber;
import behavioralpatterns.observer.subject.Publisher;

/**
 * The observer pattern has four participants.
 *
 * Subject – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.
 * ConcreteSubject – concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.
 * Observer – interface or abstract class defining the operations to be used to notify this object.
 * ConcreteObserver – concrete Observer implementations.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Observers
        Subscriber redditSubscriber = new RedditSubscriber();
        Subscriber youTubeSubscriber = new YouTubeSubscriber();
        Subscriber onlyFansSubscriber = new OnlyFansSubscriber();

        // Subject
        Publisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(redditSubscriber);
        messagePublisher.attach(youTubeSubscriber);

        messagePublisher.notifyUpdate(new Message("First Message"));   // redditSubscriber and youTubeSubscriber will receive the update

        messagePublisher.detach(redditSubscriber);
        messagePublisher.attach(onlyFansSubscriber);

        messagePublisher.notifyUpdate(new Message("Second Message")); // youTubeSubscriber and onlyFansSubscriber will receive the update
    }
}
