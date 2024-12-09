package Model.Enterprise.Logistic;

import Model.Role.User;

public class Route {
    private String routeId;
    private String start;
    private String end;
    private String description;
    private User assignedUser; // Reference to a User object


    public Route(String routeId,String description, String start, String end) {
        this.routeId = routeId;
        this.start = start;
        this.end = end;
        this.description = description;
        this.assignedUser = null; // No user assigned initially
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
    
    
}