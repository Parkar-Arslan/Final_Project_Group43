package Model.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages a directory of trucks.
 */
public class TruckDirectory {
    private List<Truck> trucks;

    public TruckDirectory() {
        trucks = new ArrayList<>();
    }

    public void addTruck(String truckId, String model, int capacity) {
        Truck truck = new Truck(truckId, model, capacity);
        trucks.add(truck);
    }

    public List<Truck> getTrucks() {
        return trucks;
    }

    // Additional methods to find, update, and delete trucks can be added here.
}