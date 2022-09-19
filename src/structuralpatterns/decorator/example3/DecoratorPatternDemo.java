package structuralpatterns.decorator.example3;

import structuralpatterns.decorator.example3.decorator.CarDecorator;
import structuralpatterns.decorator.example3.decorator.LuxuryCar;
import structuralpatterns.decorator.example3.decorator.SportsCar;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();

        Car decoratedCar = new CarDecorator(new LuxuryCar(new SportsCar(basicCar)));

        decoratedCar.assemble();
    }
}
