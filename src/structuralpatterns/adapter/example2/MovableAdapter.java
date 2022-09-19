package structuralpatterns.adapter.example2;

public class MovableAdapter implements MyMovable {
    Movable car;

    public MovableAdapter(Movable car){
        this.car = car;
    }

    @Override
    public double getSpeedInKph() {
        return car.getSpeedInMph() * 1.609343502101025;
    }
}
