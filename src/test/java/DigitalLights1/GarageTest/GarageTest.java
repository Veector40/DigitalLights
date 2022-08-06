package DigitalLights1.GarageTest;

import DigitalLights1.Garage.Garage;
import DigitalLights1.Garage.Vehicles.Car;
import DigitalLights1.Garage.Vehicles.Lorry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GarageTest {
    Garage garage = new Garage();
    @Test
    public void addOverloadedLorry() {
        Lorry mercedesBenzSprinter = new Lorry("HH-3791KV", 1000, 1200);
        garage.addVehicle(mercedesBenzSprinter);

        assertThrows(IllegalStateException.class, () -> garage.getAverageLitresPerKilometer());
    }
    @Test
    public void addRegularLorry() {
        Lorry mercedesBenzSprinter = new Lorry("HH-3791KV", 1000, 200);
        garage.addVehicle(mercedesBenzSprinter);

        assertEquals(10 + mercedesBenzSprinter.getCurrentLoad() / 100, garage.getAverageLitresPerKilometer());
    }
    @Test
    public void addTwoCars(){
        Car bmwE30M3 = new Car("M-4497QV", 2.5);
        garage.addVehicle(bmwE30M3);

        Car mercedesAmgCl65 = new Car("S-8263MN", 6.5);
        garage.addVehicle(mercedesAmgCl65);
        assertEquals((bmwE30M3.getEngineVolume() * 3 + mercedesAmgCl65.getEngineVolume() * 3)/2, garage.getAverageLitresPerKilometer());
    }
}
