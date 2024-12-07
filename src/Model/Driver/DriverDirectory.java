package Model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverDirectory {
    private List<Driver> drivers;

    public DriverDirectory() {
        drivers = new ArrayList<>();
    }

    public void addDriver(String driverId, String name) {
        Driver driver = new Driver(driverId, name);
        drivers.add(driver);
    }
    
     public void addDriver(String driverId, String name, String licenseNumber) {
        Driver driver = new Driver(driverId, name, licenseNumber);
        drivers.add(driver);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public Driver findDriverById(String driverId) {
        for (Driver driver : drivers) {
            if (driver.getDriverId().equals(driverId)) {
                return driver;
            }
        }
        return null;
    }
}