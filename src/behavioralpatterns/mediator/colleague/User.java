package behavioralpatterns.mediator.colleague;

import behavioralpatterns.mediator.mediator.IChatRoom;

/**
 * Colleague class
 */
public abstract class User
{
    private final IChatRoom mediator;

    private final int userId;

    private static int id = 0;
    private final String name;

    public User(IChatRoom room, String name){
        this.mediator = room;
        this.name = name;
        userId = ++id;
    }

    public abstract void send(String message, User user);
    public abstract void receive(String message);

    public IChatRoom getMediator() {
        return mediator;
    }

    public int getId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}