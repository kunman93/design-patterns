package creationalpatterns.singleton;

public class SingletonClass {
    private static SingletonClass instance = null;
    private static String info = "Initial info class";

    private SingletonClass(){
    }

    public static SingletonClass getInstance(){
        if(instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public String getInfo(){
        return info;
    }
}
