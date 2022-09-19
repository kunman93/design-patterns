package behavioralpatterns.state.example1.state;

import behavioralpatterns.state.example1.context.Parcel;

public interface ParcelState {
    void executeState(Parcel parcel);
}
