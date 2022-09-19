package structuralpatterns.flyweight.shape;

import structuralpatterns.flyweight.color.Color;

public class Rectangle implements Shape {
    private Color color;
    private int width;
    private int height;

    public Rectangle(Color color){
        this.color = color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("Rectangle: Draw() [Color : " + color + ", width : " + width + ", height :" + height);
    }
}
