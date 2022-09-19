package structuralpatterns.bridge.example1.abstraction;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("drawn a triangle " + color.fill());
    }
}
