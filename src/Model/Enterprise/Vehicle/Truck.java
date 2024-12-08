package Model.Enterprise.Vehicle;

import Model.Enterprise.Logistic.Route;
import Model.Role.Driver;

public class Truck {
    private String truckId;
    private String description;
    private int capacity;
    private boolean isAssigned;
    private Driver assignedDriver; 
    private Route assignedRoute;
    private int trashCollected; // Holds the amount of trash collected in kilograms
    private String status; // Holds the current status of the truck

    public Truck(String truckId, String description, int capacity) {
        this.truckId = truckId;
        this.description = description;
        this.capacity = capacity;
        this.isAssigned = false;
        this.assignedDriver = null; 
        this.assignedRoute = null; 
        this.trashCollected = 0; // Initialize with no trash collected
        this.status = "Idle"; // Default status of the truck
    }
    
     // Method to simulate trash collection
    public int collectTrash(int amount) {
        if (amount + this.trashCollected <= this.capacity) {
            this.trashCollected += amount;
            setStatus("Collecting"); // Update status when collecting trash
            return amount;
        } else {
            int collectable = this.capacity - this.trashCollected;
            this.trashCollected = this.capacity;
            setStatus("Full"); // Update status to full when capacity is reached
            return collectable;
        }
    }

    public int getTrashCollected() {
        return trashCollected;
    }

    public void setTrashCollected(int trashCollected) {
        this.trashCollected = trashCollected;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Route getAssignedRoute() {
        return assignedRoute;
    }

    public void setAssignedRoute(Route assignedRoute) {
        this.assignedRoute = assignedRoute;
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