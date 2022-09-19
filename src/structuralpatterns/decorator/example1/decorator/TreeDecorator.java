package structuralpatterns.decorator.example1.decorator;

import structuralpatterns.decorator.example1.ChristmasTree;

public class TreeDecorator implements ChristmasTree {

    private final ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
