package creationalpatterns.builder.example1.userbuilder;

public class UserBuilder {
    private final String firstName;
    private final String lastName;
    private int age;
    private String phone;
    private String address;

    public UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    // Return the finally constructed User object
    public User build() {
        User user = new User(firstName, lastName, age, phone, address);
        validateUserObject(user);
        return user;
    }

    private void validateUserObject(User user) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}