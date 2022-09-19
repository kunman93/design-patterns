package behavioralpatterns.state.example2.state;

import behavioralpatterns.state.example2.context.Parcel;

public class OrderedState implements ParcelState {

    @Override
    public void next(Parcel parcel) {
        parcel.setState(new DeliveredState());
    }

    @Override
    public void prev(Parcel parcel) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}