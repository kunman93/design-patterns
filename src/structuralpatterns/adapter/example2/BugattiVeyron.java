package structuralpatterns.adapter.example2;

public class BugattiVeyron implements Movable {
    private static final double SPEED_IN_MPH = 268;

    @Override
    public double getSpeedInMph() {
        return SPEED_IN_MPH;
    }
}
