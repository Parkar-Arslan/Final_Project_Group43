package Model.Enterprise.Logistic;

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

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }
}