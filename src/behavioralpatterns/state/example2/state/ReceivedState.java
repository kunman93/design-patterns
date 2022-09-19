package behavioralpatterns.state.example2.state;

import behavioralpatterns.state.example2.context.Parcel;

public class ReceivedState implements ParcelState {

    @Override
    public void next(Parcel parcel) {
        //do nothing, cause there ain't a next state
    }

    @Override
    public void prev(Parcel parcel) {
        parcel.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("This package is already received by a client.");
    }
}
