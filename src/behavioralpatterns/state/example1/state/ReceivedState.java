package behavioralpatterns.state.example1.state;

import behavioralpatterns.state.example1.context.Parcel;

public class ReceivedState implements ParcelState {
    @Override
    public void executeState(Parcel parcel){
        System.out.println("This package is already received by a client.");
    }
}
