import java.util.HashMap;

public class MetroSystem {
    private HashMap<Integer, Stop> stopMap;
    private HashMap<Integer, Bus> busMap;
    private HashMap<Integer, Route> routeMap;

    public MetroSystem() {
        stopMap = new HashMap<Integer, Stop>();
        busMap = new HashMap<Integer, Bus>();
        routeMap =  new HashMap<Integer, Route>();
    }

    // given stopID, return corresponding stop or return null
    public Stop getStop(int stopID){
        return stopMap.getOrDefault(stopID, null);
    }

    // given busID, return corresponding bus or return null
    public Bus getBus(int busID) {
        return busMap.getOrDefault(busID, null);
    }

    // given routeID, return corresponding route or return null
    public Route getRoute(int routeID) {
        return routeMap.getOrDefault(routeID, null);
    }

    public void addStop(int stopID, String name, int riders, double latPos, double longPos) {
        stopMap.put(stopID, new Stop(stopID, name, riders, latPos, longPos));
    }

    public void addBus(int busID, int routeID, int routeIndex, int initPassengers, int capacity, int initFuel, int fuelCapacity, int speed) {
        busMap.put(busID, new Bus(busID, routeID, routeIndex, initPassengers, capacity, initFuel, fuelCapacity, speed));
    }

    public void addRoute(int routeID, int number, String name) {
        routeMap.put(routeID, new Route(routeID, number, name));
    }

    public void extendRoute(int routeID, int stopID) {
        routeMap.get(routeID).addStop(stopID);
    }


}
