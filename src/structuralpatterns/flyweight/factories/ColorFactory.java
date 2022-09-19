package structuralpatterns.flyweight.factories;

import structuralpatterns.flyweight.color.*;

public class ColorFactory implements AbstractColorFactory<Color, ColorChoice>{

    @Override
    public Color createColor(ColorChoice colorChoice){
        return switch (colorChoice) {
                case RED -> new Red();
                case BLUE -> new Blue();
                case GREEN -> new Green();
        };
    }
}
