package Model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverDirectory {
    private List<Driver> drivers;

    public DriverDirectory() {
        drivers = new ArrayList<>();
    }

    public Driver addDriver(String driverId, String name, String licenseNumber) {
        Driver newDriver = new Driver(driverId, name, licenseNumber);
        drivers.add(newDriver);
        return newDriver;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    // Additional methods like find, delete, update could be added here
}