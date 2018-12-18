import java.util.ArrayList;

public class Route {
    private int routeID;
    private int routeNumber;
    private String name;
    private ArrayList<Integer> stops;

    public Route(int routeID, int number, String name) {
        this.routeID = routeID;
        this.routeNumber = number;
        this.name = name;
        this.stops = new ArrayList<Integer>();

    }

    // append a new stop to the route
    public void addStop(int stopID) {
        stops.add(stopID);
    }

    // given the current route index, return the next one. Use remainder function for loop-around
    public int getNextIndex(int currentRouteIndex) {
        return (currentRouteIndex + 1) % stops.size();
    }

    // given the routeIndex along the route, return the matching stop ID
    public int getStopID(int routeIndex) {
        return stops.get(routeIndex);
    }

    // get number
    public int getRouteNumber() {
        return this.routeNumber;
    }

    //get ID
    public int getRouteID() {
        return this.routeID;
    }

    //get name
    public String getName() {
        return this.name;
    }

}
