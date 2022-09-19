package behavioralpatterns.state.example2;

import behavioralpatterns.state.example2.context.Parcel;

public class StatePatternDemo {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.printStatus();

        parcel.nextState();
        parcel.printStatus();

        parcel.nextState();
        parcel.printStatus();
    }
}
