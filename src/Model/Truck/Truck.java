package Model.Truck;

import Model.Driver.Driver;

public class Truck {
    private String truckId;
    private String description;
    private int capacity;
    private boolean isAssigned;
    private Driver assignedDriver; 

    public Truck(String truckId, String description, int capacity) {
        this.truckId = truckId;
        this.description = description;
        this.capacity = capacity;
        this.isAssigned = false;
        this.assignedDriver = null; 
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

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsAssigned(boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    

    public boolean isIsAssigned() {
        return isAssigned;
    }

    public Driver getAssignedDriver() {
        return assignedDriver;
    }
    
    public void setDriver(Driver driver) {
        this.assignedDriver = driver;
    }

    public Driver getDriver() {
        return assignedDriver;
    }
    
    public void setAssignedDriver(Driver assignedDriver) {
        this.assignedDriver = assignedDriver;
        if (assignedDriver != null) {
            this.isAssigned = true; // Automatically mark the truck as assigned if a driver is set
        } else {
            this.isAssigned = false; // Automatically unassign the truck if the driver is removed
        }
    }
}