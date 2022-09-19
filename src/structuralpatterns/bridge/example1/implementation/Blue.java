package structuralpatterns.bridge.example1.implementation;

public class Blue implements Color {
    @Override
    public String fill() {
        return "filled with blue color";
    }
}
