
import java.util.ArrayList;
import java.util.List;

public class RouteDirectory {
    private List<Route> routeList;

    public RouteDirectory() {
        routeList = new ArrayList<>();
    }

    public Route createRoute(String routeId, String startLocation, String endLocation) {
        Route newRoute = new Route(routeId, startLocation, endLocation);
        routeList.add(newRoute);
        return newRoute;
    }

    public List<Route> getRoutes() {
        return routeList;
    }

    public Route findRouteById(String routeId) {
        for (Route route : routeList) {
            if (route.getRouteId().equals(routeId)) {
                return route;
            }
        }
        return null; // No route found
    }
}
