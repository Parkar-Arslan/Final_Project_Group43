package Model.Driver;

import Model.Truck.Truck;

public class Driver {
    private String driverId;
    private String name;
    private Truck assignedTruck;
    private String licenseNumber; // Adding license number field

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.assignedTruck = null;
    }
    
    public Driver(String driverId, String name, String licenseNumber) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Getters
    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public Truck getAssignedTruck() {
        return assignedTruck;
    }

    // Setter
    public void assignTruck(Truck truck) {
        this.assignedTruck = truck;
        truck.setAssigned(true);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    
}