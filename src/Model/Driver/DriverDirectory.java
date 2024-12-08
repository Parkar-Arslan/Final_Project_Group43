package Model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverDirectory {
    private List<Driver> drivers;
    private static DriverDirectory instance = null; // Singleton instance

    // Private constructor for singleton
    public DriverDirectory() {
        drivers = new ArrayList<>();
    }

    // Public method to get the singleton instance
    public static DriverDirectory getInstance() {
        if (instance == null) {
            instance = new DriverDirectory();
        }
        return instance;
    }

    // Method to add a driver
    public Driver addDriver(String driverId, String name, String licenseNumber) {
        Driver driver = new Driver(driverId, name, licenseNumber);
        drivers.add(driver); // Add the driver to the list
        System.out.println("Driver added: " + driverId + " - " + name);
        return driver; // Return the newly created driver
    }

    // Method to return a copy of the list of all drivers
    public List<Driver> getAvailableDrivers() {
        return new ArrayList<>(drivers);
    }

    // Method to find a driver by ID
    public Driver findDriverById(String id) {
        for (Driver driver : drivers) {
            if (driver.getDriverId().equals(id)) {
                return driver;
            }
        }
        return null;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }
    
    
}