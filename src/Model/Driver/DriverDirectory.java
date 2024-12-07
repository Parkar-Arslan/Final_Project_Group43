package Model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverDirectory {
    private List<Driver> drivers;

    public DriverDirectory() {
        drivers = new ArrayList<>();
    }

    // Adds a driver with a license number, ensuring details are logged for confirmation.
    public void addDriver(String driverId, String name, String licenseNumber) {
        Driver driver = new Driver(driverId, name, licenseNumber);
        drivers.add(driver);
        System.out.println("Driver added: " + driverId + " - " + name);
    }

    // Returns a list of all available drivers, with debug output to check contents.
//    public List<Driver> getAvailableDrivers() {
//        System.out.println("Listing available drivers:");
//        if (drivers.isEmpty()) {
//            System.out.println("No drivers available.");
//        }
//        for (Driver driver : drivers) {
//            System.out.println("Driver ID: " + driver.getDriverId() + ", Name: " + driver.getName());
//        }
//        return new ArrayList<>(drivers);  // Returning a copy to avoid modification issues
//    }
    
    public List<Driver> getAvailableDrivers() {
        // Simple implementation, returning all trucks
        return drivers;
    }

    // Finds a driver by ID, returning null if not found.
    public Driver findDriverById(String id) {
        for (Driver driver : drivers) {
            if (driver.getDriverId().equals(id)) {
                return driver;
            }
        }
        return null; // Return null if no driver is found with the given ID
    }
}