package creationalpatterns.builder.example1;

import creationalpatterns.builder.example1.userbuilder.User;
import creationalpatterns.builder.example1.userbuilder.UserBuilder;

/**
 * The builder pattern simplifies the creation of objects. It also simplifies the code as your do not have to call a
 * complex constructor or call several setter methods on the created object.
 * The builder pattern can be used to create an immutable class.
 *
 * https://refactoring.guru/design-patterns/builder
 */

public class Client {
    public static void main(String[] args) {
        // First name and last name are required the parameters are optional
        User user1 = new UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user1);

        User user2 = new UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
