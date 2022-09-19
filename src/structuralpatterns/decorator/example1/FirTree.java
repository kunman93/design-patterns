package structuralpatterns.decorator.example1;

public class FirTree implements ChristmasTree{
    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
