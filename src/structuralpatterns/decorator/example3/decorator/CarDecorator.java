package structuralpatterns.decorator.example3.decorator;

import structuralpatterns.decorator.example3.Car;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
