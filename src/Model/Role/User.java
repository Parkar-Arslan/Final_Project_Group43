package Model.Role;

import Model.Enterprise.Logistic.Route;
import Model.Enterprise.Vehicle.Truck;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private List<Route> assignedRoutes; // List of routes assigned to the user
    private double totalTrashCollected; // Total trash collected by the user
    private Truck assignedTruck; // Truck assigned to the user
    private Driver assignedDriver; // Driver assigned to the user

    public User(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.assignedRoutes = new ArrayList<>();
         this.totalTrashCollected = 0.0;
        this.assignedTruck = null;
        this.assignedDriver = null;
    }

    public double getTotalTrashCollected() {
        return totalTrashCollected;
    }

    public void setTotalTrashCollected(double totalTrashCollected) {
        this.totalTrashCollected = totalTrashCollected;
    }

    public Truck getAssignedTruck() {
        return assignedTruck;
    }

    public void setAssignedTruck(Truck assignedTruck) {
        this.assignedTruck = assignedTruck;
    }

    public Driver getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(Driver assignedDriver) {
        this.assignedDriver = assignedDriver;
    }
    
    

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<Route> getAssignedRoutes() {
        return assignedRoutes;
    }

    public void addAssignedRoute(Route route) {
        if (route != null) {
            assignedRoutes.add(route);
        }
    }

    public void removeAssignedRoute(Route route) {
        assignedRoutes.remove(route);
    }
    
    
}
