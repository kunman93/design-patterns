package structuralpatterns.decorator.example1.decorator;

import structuralpatterns.decorator.example1.ChristmasTree;

public class TreeTopper extends TreeDecorator{

    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with tree topper";
    }
}
