package structuralpatterns.proxy.example1;

/**
 * Consider a heavy Java object (like a JDBC connection or a SessionFactory) that requires some initial configuration.
 * We only want such objects to be initialized on demand, and once they are, we'd want to reuse them for all calls
 */
public class Client {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
