package DigitalLights1.Garage.Vehicles;

public class Lorry extends Vehicle{
    private double maximumPermissibleLoad;
    private double currentLoad;

    public Lorry(String registrationPlate,
                 double lorryMaximumPermissibleLoad,
                 double lorryCurrentLoad) {
        super(registrationPlate);
        maximumPermissibleLoad = lorryMaximumPermissibleLoad;
        currentLoad = lorryCurrentLoad;
    }

    public boolean isOverloaded() {
        return maximumPermissibleLoad < currentLoad;
    }
    public double getCurrentLoad() {
        return currentLoad;
    }
    public double getMaximumPermissibleLoad() {
        return maximumPermissibleLoad;
    }
    @Override
    public double fuelConsumption(){
        return 10 + currentLoad / 100;
    }
}
