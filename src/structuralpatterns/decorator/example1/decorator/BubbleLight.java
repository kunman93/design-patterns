package structuralpatterns.decorator.example1.decorator;

import structuralpatterns.decorator.example1.ChristmasTree;

public class BubbleLight extends TreeDecorator{

    public BubbleLight(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with bubble lights";
    }
}
