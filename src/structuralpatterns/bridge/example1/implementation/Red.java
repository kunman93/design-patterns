package structuralpatterns.bridge.example1.implementation;

public class Red implements Color {
    @Override
    public String fill() {
        return "filled with red color";
    }
}
