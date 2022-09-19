package behavioralpatterns.state.example1.state;

import behavioralpatterns.state.example1.context.Parcel;

public class OrderedState implements ParcelState {
    @Override
    public void executeState(Parcel parcel){
        parcel.setParcelState(new DeliveredState());
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
