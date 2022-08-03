package DigitalLights1.Garage.Vehicles;

public class Lorry {
    public String registrationPlate;
    public double maximumPermissibleLoad;
    public double currentLoad;

    public Lorry(String lorryRegistrationPlate,
                 double lorryMaximumPermissibleLoad,
                 double lorryCurrentLoad) {
        registrationPlate = lorryRegistrationPlate;
        maximumPermissibleLoad = lorryMaximumPermissibleLoad;
        currentLoad = lorryCurrentLoad;
    }
    public boolean checkIfOverloaded() {
        return maximumPermissibleLoad < currentLoad;
    }
}
