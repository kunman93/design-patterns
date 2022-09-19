package behavioralpatterns.state.example1.context;

import behavioralpatterns.state.example1.state.OrderedState;
import behavioralpatterns.state.example1.state.ParcelState;

public class Parcel {

    private ParcelState parcelState;

    public Parcel(ParcelState initialParcelState){
        this.parcelState = initialParcelState;

        if(parcelState == null){
            parcelState = new OrderedState();
        }
    }

    public void getStatusOfParcel() {
        parcelState.executeState(this);
    }

    public void setParcelState(ParcelState parcelState){
        this.parcelState = parcelState;
    }
}
