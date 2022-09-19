package creationalpatterns.singleton;

public class Client {
    public static void main(String[] args){
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.getInfo());
    }
}
