package DigitalLights1.Garage.Vehicles;

abstract class Vehicle {
    private String registrationPlate;
    public Vehicle(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }
    public String getRegistrationPlate() {return registrationPlate; }
    abstract public double fuelConsumption();
}
