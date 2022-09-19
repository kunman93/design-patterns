package creationalpatterns.abstractfactory.example1.factories;

import creationalpatterns.abstractfactory.example1.colorfamily.Brown;
import creationalpatterns.abstractfactory.example1.colorfamily.Color;
import creationalpatterns.abstractfactory.example1.colorfamily.ColorDesignation;
import creationalpatterns.abstractfactory.example1.colorfamily.White;

public class ColorFactory implements AbstractFactory<Color,ColorDesignation>{
    @Override
    public Color create(ColorDesignation colorDesignation) {
        return switch (colorDesignation){
            case BROWN -> new Brown();
            case WHITE -> new White();
        };
    }
}
