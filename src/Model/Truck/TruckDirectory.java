package Model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckDirectory {
    private List<Truck> trucks;

    public TruckDirectory() {
        this.trucks = new ArrayList<>();
    }

    public void addTruck(String truckId, String description, int capacity) {
        Truck truck = new Truck(truckId, description, capacity);
        trucks.add(truck);
    }
    
    public List<Truck> getAvailableTrucks() {
        // Simple implementation, returning all trucks
        return trucks;
    }
    
    

    public List<Truck> getTrucks() {
        return trucks;
    }

    public Truck findTruckById(String id) {
    for (Truck truck : trucks) {  // Assuming there's an iterable list of trucks
        if (truck.getTruckId().equals(id)) {
            return truck;
        }
    }
    return null;
    }
//    public Truck findTruckById(String truckId) {
//        for (Truck truck : trucks) {
//            if (truck.getTruckId().equals(truckId)) {
//                return truck;
//            }
//        }
//        return null;
//    }
}