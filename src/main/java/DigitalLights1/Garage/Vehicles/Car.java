package DigitalLights1.Garage.Vehicles;

public class Car extends Vehicle {
    private double engineVolume;

    public Car(String registrationPlate, double carEngineVolume) {
        super(registrationPlate);
        engineVolume = carEngineVolume;
    }
    public double fuelConsumption() {
        return engineVolume * 3;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
}