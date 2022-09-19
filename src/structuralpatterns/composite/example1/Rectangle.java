package structuralpatterns.composite.example1;

public class Rectangle implements Leaf{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
}
