package creationalpatterns.prototype;

import creationalpatterns.prototype.vehiclecache.VehicleCache;
import creationalpatterns.prototype.vehicleprototype.Bus;
import creationalpatterns.prototype.vehicleprototype.Car;
import creationalpatterns.prototype.vehicleprototype.Vehicle;

import java.util.List;
import java.util.stream.Collectors;

public class Client {

    /*
     * Video Reference: https://youtu.be/DcFhITC9v0E
     */
    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300),
                new Bus("bus_brand", "bus_model", "bus_color", 8)
        );

        List<Vehicle> copyOfVehicles = vehicles.stream().map(Vehicle::clone).toList();
        copyOfVehicles.forEach(System.out::println);

        System.out.println("=======================================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));

    }

}