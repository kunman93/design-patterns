package structuralpatterns.composite.example1;

public class Line implements Leaf {
    @Override
    public void draw() {
        System.out.println("Draw a line");
    }
}
