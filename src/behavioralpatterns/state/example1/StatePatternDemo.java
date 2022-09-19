package behavioralpatterns.state.example1;

import behavioralpatterns.state.example1.context.Parcel;
import behavioralpatterns.state.example1.state.OrderedState;

public class StatePatternDemo {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(new OrderedState());

        parcel.getStatusOfParcel();
        parcel.getStatusOfParcel();
        parcel.getStatusOfParcel();
    }
}
