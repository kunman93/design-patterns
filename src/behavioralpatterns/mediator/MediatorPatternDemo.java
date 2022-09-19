package behavioralpatterns.mediator;

import behavioralpatterns.mediator.colleague.ChatUser;
import behavioralpatterns.mediator.colleague.User;
import behavioralpatterns.mediator.mediator.ChatRoom;
import behavioralpatterns.mediator.mediator.IChatRoom;

/**
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets us vary
 * their interaction independently.
 *
 * Mediator helps in establishing loosely coupled communication between objects and helps in reducing the direct
 * references to each other. This helps in minimizing the complexity of dependency management and communications among
 * participating objects.
 *
 * Mediator helps to facilitate the interaction between objects in a manner in that objects are not aware of the existence
 * of other objects. Objects depend only on a single mediator class instead of being coupled to dozens of other objects.
 *
 * Mediator – defines the interface for communication between Colleague objects
 *
 * ConcreteMediator – implements the Mediator interface and coordinates communication between Colleague objects.
 * It is aware of all of the Colleagues and their purposes with regards to inter-communication.
 *
 * Colleague – defines the interface for communication with other Colleagues through its Mediator
 *
 * ConcreteColleague – implements the Colleague interface and communicates with other Colleagues through its Mediator
 *
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        IChatRoom chatroom = new ChatRoom();

        User userAlex = new ChatUser(chatroom,"Alex");
        User userBrian = new ChatUser(chatroom, "Brian");

        userAlex.send("Hello brian", userBrian);
        userBrian.send("Hey buddy", userAlex);
    }
}
