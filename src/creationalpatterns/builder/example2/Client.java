package creationalpatterns.builder.example2;

import creationalpatterns.builder.example2.builder.carbuilder.Car;
import creationalpatterns.builder.example2.builder.carbuilder.CarBuilder;
import creationalpatterns.builder.example2.builder.carschemabuilder.CarSchema;
import creationalpatterns.builder.example2.builder.carschemabuilder.CarSchemaBuilder;
import creationalpatterns.builder.example2.director.Director;

public class Client {

    /**
     * The builder pattern simplifies the creation of objects. It also simplifies the code as your do not have to call a
     * complex constructor or call several setter methods on the created object.
     * The builder pattern can be used to create an immutable class.
     *
     * Video Reference: https://youtu.be/MaY_MDdWkQw
     */
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.buildBugatti(carBuilder);
        carBuilder.model("Chiron");
        Car car = carBuilder.build();
        System.out.println(car);

        CarSchemaBuilder carSchemaBuilder = new CarSchemaBuilder();
        director.buildLambo(carSchemaBuilder);
        carSchemaBuilder.engine("90").nbrOfDoors(3);
        CarSchema carSchema = carSchemaBuilder.build();
        System.out.println(carSchema);
    }

}