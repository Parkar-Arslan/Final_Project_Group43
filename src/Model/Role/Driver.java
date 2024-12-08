package Model.Role;

import Model.Enterprise.Vehicle.Truck;

public class Driver {


    private String driverId;
    private String name;

    private Truck assignedTruck;  // Holds a reference to the assigned truck
    private String licenseNumber; // Store license number for driver identification

    public Driver(String driverId, String name, String licenseNumber) {
        this.driverId = driverId;
        this.name = name;
        this.assignedTruck = null;  // Initially, no truck is assigned
        this.licenseNumber = licenseNumber;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public Truck getAssignedTruck() {
        return assignedTruck;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    
    

    public void setAssignedTruck(Truck assignedTruck) {
        this.assignedTruck = assignedTruck;
        if (assignedTruck != null) {
            assignedTruck.setAssignedDriver(this);
            System.out.println("Assigned truck " + assignedTruck.getDescription() + " to driver " + this.name);
        } else {
            System.out.println("No truck assigned to driver " + this.name);
        }
    }
}