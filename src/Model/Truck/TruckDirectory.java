package Model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckDirectory {
    private  List<Truck> truckList;

    public TruckDirectory() {
        truckList = new ArrayList<>();
    }

    public Truck addTruck(String truckId, String model, int capacity) {
        Truck newTruck = new Truck(truckId, model, capacity);
        truckList.add(newTruck);
        return newTruck;
    }

    public List<Truck> getTrucks() {
        return truckList;
    }

    public Truck findTruckById(String truckId) {
        for (Truck truck : truckList) {
            if (truck.getTruckId().equals(truckId)) {
                return truck;
            }
        }
        return null; // No truck found
    }
}
