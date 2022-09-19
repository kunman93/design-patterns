package behavioralpatterns.mediator.mediator;

import behavioralpatterns.mediator.colleague.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete Mediator
 */
public class ChatRoom implements IChatRoom {

    private final Map<Integer, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, User user) {
        User receivingUser = usersMap.get(user.getId());
        receivingUser.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}