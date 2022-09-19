package structuralpatterns.bridge.example2.abstraction;

import structuralpatterns.bridge.example2.implementation.DrawAPI;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawAPI = drawAPI;
    }

    @Override
    public void drawCircle() {
        drawAPI.drawCircle(x,y,radius);
    }
}
