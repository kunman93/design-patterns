package behavioralpatterns.mediator.colleague;

import behavioralpatterns.mediator.mediator.IChatRoom;

/**
 * Concrete Colleague class
 */
public class ChatUser extends User {

    public ChatUser(IChatRoom room, String name) {
        super(room, name);
        room.addUser(this);
    }

    @Override
    public void send(String msg, User user) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, user);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }

}