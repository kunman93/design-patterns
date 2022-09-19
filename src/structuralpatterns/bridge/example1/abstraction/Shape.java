package structuralpatterns.bridge.example1.abstraction;

import structuralpatterns.bridge.example1.implementation.Color;

public abstract class Shape {
    protected Color color;

    public abstract void draw();

    public void setColor(Color color) {
        this.color = color;
    }
}
