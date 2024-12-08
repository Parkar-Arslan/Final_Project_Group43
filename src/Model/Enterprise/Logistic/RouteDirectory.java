package Model.Enterprise.Logistic;

import Model.Enterprise.Logistic.Route;
import java.util.ArrayList;
import java.util.List;

public class RouteDirectory {
    private List<Route> routes;

    public RouteDirectory() {
        this.routes = new ArrayList<>();
    }

    public void addRoute(String routeId, String start, String end) {
        Route route = new Route(routeId, start, end);
        routes.add(route);
    }

    public Route findRouteById(String routeId) {
        for (Route route : routes) {
            if (route.getRouteId().equals(routeId)) {
                return route;
            }
        }
        return null;  // Return null if no route matches
    }

    public boolean removeRoute(String routeId) {
        return routes.removeIf(route -> route.getRouteId().equals(routeId));
    }

    public List<Route> getRoutes() {
        return routes;
    }
}