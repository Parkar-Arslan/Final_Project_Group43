package Model.Truck;

public class Truck {
    private String truckId;
    private String model;
    private int capacity;

    public Truck(String truckId, String model, int capacity) {
        this.truckId = truckId;
        this.model = model;
        this.capacity = capacity;
    }

    // Getters and Setters
    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
