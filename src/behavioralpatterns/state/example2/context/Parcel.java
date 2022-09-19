package behavioralpatterns.state.example2.context;

import behavioralpatterns.state.example2.state.OrderedState;
import behavioralpatterns.state.example2.state.ParcelState;

public class Parcel {

    private ParcelState state = new OrderedState();

    // getter, setter

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void setState(ParcelState state){
        this.state = state;
    }

    public void printStatus() {
        state.printStatus();
    }
}