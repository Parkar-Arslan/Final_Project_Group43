package Model.Truck;

public class Truck {
    private String truckId;
    private String description;
    private int capacity;
    private boolean isAssigned;

    public Truck(String truckId, String description, int capacity) {
        this.truckId = truckId;
        this.description = description;
        this.capacity = capacity;
        this.isAssigned = false;
    }

    // Getters
    public String getTruckId() {
        return truckId;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    // Setters
    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }
}