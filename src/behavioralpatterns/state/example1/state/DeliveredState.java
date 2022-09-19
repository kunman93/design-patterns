package behavioralpatterns.state.example1.state;

import behavioralpatterns.state.example1.context.Parcel;

public class DeliveredState implements ParcelState {
    @Override
    public void executeState(Parcel parcel){
        parcel.setParcelState(new ReceivedState());
        System.out.println("Package delivered to post office, not received yet.");
    }
}
