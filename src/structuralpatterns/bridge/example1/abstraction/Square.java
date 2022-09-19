package structuralpatterns.bridge.example1.abstraction;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("drawn a square " + color.fill());
    }
}
