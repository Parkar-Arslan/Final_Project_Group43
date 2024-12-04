
public class Route {
    private String routeId;
    private String startLocation;
    private String endLocation;

    public Route(String routeId, String startLocation, String endLocation) {
        this.routeId = routeId;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    // Getters and Setters
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }
}
