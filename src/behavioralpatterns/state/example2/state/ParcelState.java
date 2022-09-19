package behavioralpatterns.state.example2.state;

import behavioralpatterns.state.example2.context.Parcel;

public interface ParcelState {
    void next(Parcel parcel);
    void prev(Parcel parcel);
    void printStatus();
}