package structuralpatterns.composite.example1;

public class Text implements Leaf{
    @Override
    public void draw() {
        System.out.println("Draw a text");
    }
}
