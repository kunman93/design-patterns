package structuralpatterns.decorator.example1;

import structuralpatterns.decorator.example1.decorator.*;

/**
 * Suppose we have a Christmas tree object and we want to decorate it. The decoration does not change the object itself;
 * it’s just that in addition to the Christmas tree, we're adding some decoration items like garland, tinsel,
 * tree-topper, bubble lights, etc.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args){
        ChristmasTree christmasTree = new FirTree();

        // decorate christmas tree
        ChristmasTree decoratedChristmasTree = new TreeDecorator(new BubbleLight(new Garland(new Tinsel(new TreeTopper(christmasTree)))));

        System.out.println(decoratedChristmasTree.decorate());
    }
}
