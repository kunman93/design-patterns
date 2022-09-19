package structuralpatterns.adapter.example2;

/**
 * Consider a scenario in which there is an app that's developed in the US which returns the top speed of luxury cars in miles per hour (MPH).
 * Now we need to use the same app for our client in the UK that wants the same results but in kilometers per hour (km/h).
 * To deal with this problem, we'll create an adapter which will convert the values and give us the desired results.
 *
 * Adaptee (Movable)
 * - defines an existing interface that needs adapting.
 *
 * Adapter (MovableAdapter)
 * - adapts the interface of Adaptee (Movable)  to the Target interface (MyMovable).
 */
public class Client {
    public static void main(String[] args){
        Movable bugattiVeyron = new BugattiVeyron();
        MyMovable movableAdapter = new MovableAdapter(bugattiVeyron);

        System.out.println(bugattiVeyron.getSpeedInMph() + " MpH");
        System.out.println(movableAdapter.getSpeedInKph() + " KpH");
    }
}
