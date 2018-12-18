public class Bus {

    private int busID;
    private int routeID;
    private int routeIndex;
    private int passengerCount;
    private int capacity;
    private int speed;
    private int fuel;
    private int fuelCapacity;

    // Constructor for Bus instance
    public Bus (int busID, int routeID, int routeIndex, int initPassengers, int capacity, int initFuel, int fuelCapacity, int speed) {
        this.busID = busID;
        this.routeID = routeID;
        this.routeIndex = routeIndex;
        this.passengerCount = initPassengers;
        this.capacity = capacity;
        this.speed = speed;
        this.fuel = initFuel;
        this.fuelCapacity = fuelCapacity;
    }

    // get and set route
    public void setRoute(int routeID) {
        this.routeID = routeID;
    }

    public int getRoute() {
        return this.routeID;
    }

    // get and set routeIndex
    public void setRouteIndex(int routeIndex) {
        this.routeIndex = routeIndex;
    }

    public int getRouteIndex() {
        return this.routeIndex;
    }

    // get and set passengerCount
    public void setPassengerCount(int passengers) {
        this.passengerCount = passengers;
    }

    public int getPassengerCount() {
        return this.passengerCount;
    }

    // get and set capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    // get and set speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

}
