package Model.Route;

public class Route {
    private String routeId;
    private String start;
    private String end;

    public Route(String routeId, String start, String end) {
        this.routeId = routeId;
        this.start = start;
        this.end = end;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}