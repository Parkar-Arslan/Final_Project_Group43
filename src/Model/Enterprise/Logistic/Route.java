package Model.Enterprise.Logistic;

import Model.Role.User;

public class Route {
    private String routeId;
    private String start;
    private String end;
    private String description;
    private User assignedUser; // Reference to a User object
    private int trashCollected; // Holds the total trash collected in kilograms
    private String status; // Current status of the route (e.g., Pending, Completed)


    public Route(String routeId,String description, String start, String end) {
        this.routeId = routeId;
        this.start = start;
        this.end = end;
        this.description = description;
        this.assignedUser = null; // No user assigned initially
        this.trashCollected = 0; // Default no trash collected
        this.status = "Pending"; // Default status
        
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    
    public String getRouteId() {
        return routeId;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    
    
     @Override
    public String toString() {
        return "Route ID: " + routeId + ", Description: " + description + 
               ", Trash Collected: " + trashCollected + " kg, Status: " + status;
    }
}