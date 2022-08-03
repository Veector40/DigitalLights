package DigitalLights1.GarageTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import DigitalLights1.Garage.Garage;
import DigitalLights1.Garage.Vehicles.Car;
import DigitalLights1.Garage.Vehicles.Lorry;

import org.junit.jupiter.api.Test;

public class GarageTest {
    Garage garage = new Garage();
    @Test
    public void addVehicleTest(){
        Car bmwE30M3 = new Car("M-4497QV", 2.5);
        garage.addVehicle(bmwE30M3);

        Car mercedesAmgCl65 = new Car("S-8263MN", 6.5);
        garage.addVehicle(mercedesAmgCl65);

        Lorry mercedesBenzSprinter = new Lorry("HH-3791KV", 1000, 200);
        garage.addVehicle(mercedesBenzSprinter);

        assertEquals(13, garage.getAverageLitresPerKilometer());
    }
}
