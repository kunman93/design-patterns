package behavioralpatterns.state.example2.state;

import behavioralpatterns.state.example2.context.Parcel;

public class DeliveredState implements ParcelState {

    @Override
    public void next(Parcel parcel) {
        parcel.setState(new ReceivedState());
    }

    @Override
    public void prev(Parcel parcel) {
        parcel.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
