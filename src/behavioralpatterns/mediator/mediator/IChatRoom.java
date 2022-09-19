package behavioralpatterns.mediator.mediator;

import behavioralpatterns.mediator.colleague.User;

/**
 * Mediator
 */
public interface IChatRoom {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
