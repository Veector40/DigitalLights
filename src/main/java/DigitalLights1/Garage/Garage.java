package DigitalLights1.Garage;

import DigitalLights1.Garage.Vehicles.Car;
import DigitalLights1.Garage.Vehicles.Lorry;

import java.util.ArrayList;

public class Garage {
    public ArrayList garage = new ArrayList();
    public <T> void addVehicle(T vehicle) {
        if (vehicle instanceof Car || vehicle instanceof Lorry)
            garage.add(vehicle);
        else
            throw new IllegalStateException("Said vehicle is not of type Car or Lorry");
    }
    public double getAverageLitresPerKilometer() {
        double totalLitresPerKilometer = 0;
        for(int vehicleNum = 0; vehicleNum < garage.size(); vehicleNum++) {
            if(garage.get(vehicleNum) instanceof Car) {
                Car vehicle =  (Car) garage.get(vehicleNum);
                totalLitresPerKilometer += vehicle.fuelConsumption();
            } else if(garage.get(vehicleNum) instanceof Lorry) {
                Lorry vehicle =  (Lorry) garage.get(vehicleNum);
                if(vehicle.isOverloaded()){
                       throw new IllegalStateException("Lorry with registration plate HH-3791KV is overloaded");
                }
                totalLitresPerKilometer += vehicle.fuelConsumption();
            }
        }
        return totalLitresPerKilometer / garage.size();
    }
}

