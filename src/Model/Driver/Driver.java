package Model.Driver;

import Model.Truck.Truck;

public class Driver {
    private String driverId;
    private String name;
    private Truck assignedTruck;
    private String licenseNumber; // Including license number for completeness

    public Driver(String driverId, String name, String licenseNumber) {
        this.driverId = driverId;
        this.name = name;
        this.assignedTruck = null;
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

    public void setAssignedTruck(Truck assignedTruck) {
        this.assignedTruck = assignedTruck;
        if (assignedTruck != null) {
            assignedTruck.setAssignedDriver(this); // Assume Truck has a method to link back to the driver
        }
    }
}