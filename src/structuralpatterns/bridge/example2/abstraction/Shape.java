package structuralpatterns.bridge.example2.abstraction;

import structuralpatterns.bridge.example2.implementation.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    public abstract void drawCircle();
}
