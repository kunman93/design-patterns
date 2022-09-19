package behavioralpatterns.chainofresponsibilities.example1;


import behavioralpatterns.chainofresponsibilities.example1.handler.Handler;
import behavioralpatterns.chainofresponsibilities.example1.handler.RoleCheckHandler;
import behavioralpatterns.chainofresponsibilities.example1.handler.UserExistsHandler;
import behavioralpatterns.chainofresponsibilities.example1.handler.ValidPasswordHandler;

public class Client {

    /*
     * Video Reference: https://youtu.be/FafNcoBvVQo
     */
    public static void main(String[] args) {

        Database database = new Database();

        Handler handler = new UserExistsHandler(database);
        // you can't chain the line above with the lines below!
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "user_password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");

    }

}