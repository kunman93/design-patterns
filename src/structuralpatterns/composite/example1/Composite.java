package structuralpatterns.composite.example1;

public interface Composite extends Graphic {
    void addGraphic(Graphic graphic);
    void removeGraphic(Graphic graphic);
    int getChild();
}
