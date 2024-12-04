
import java.util.ArrayList;
import java.util.List;

public class DriverDirectory {
    private List<Driver> driverList;

    public DriverDirectory() {
        driverList = new ArrayList<>();
    }

    public Driver createDriver(String driverId, String name, String licenseNumber) {
        Driver newDriver = new Driver(driverId, name, licenseNumber);
        driverList.add(newDriver);
        return newDriver;
    }

    public List<Driver> getDrivers() {
        return driverList;
    }

    public Driver findDriverById(String driverId) {
        for (Driver driver : driverList) {
            if (driver.getDriverId().equals(driverId)) {
                return driver;
            }
        }
        return null; // No driver found
    }
}
