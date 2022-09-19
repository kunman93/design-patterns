package structuralpatterns.proxy.example2;

/**
 * We are going to create an Image interface and concrete classes implementing the Image interface.
 * ProxyImage is a proxy class to reduce memory footprint of RealImage object loading.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println();

        //image will not be loaded from disk
        image.display();
    }
}