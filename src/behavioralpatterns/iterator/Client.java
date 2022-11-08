package behavioralpatterns.iterator;

/**
 * Iterator pattern is very commonly used design pattern in Java and .Net programming environment. This pattern is used
 * to get a way to access the elements of a collection object in sequential manner without any need to know its
 * underlying representation.
 */
public class Client {
    public static void main(String[] args) {
        AbstractList<String> names = new List<>();

        names.addElement("Robert");
        names.addElement("John");
        names.addElement("Julie");
        names.addElement("Lora");

        for(Iterator<String> iterator = names.iterator(); iterator.hasNext();){
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
