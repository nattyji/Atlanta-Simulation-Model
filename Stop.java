public class Stop {
    private int stopID;
    private String name;
    private int waitingPassengers;
    private double latPos;
    private double longPos;

    public Stop(int stopID, String name, int waitingPassengers, double latPos, double longPos) {
        this.stopID = stopID;
        this.name = name;
        this.waitingPassengers = waitingPassengers;
        this.latPos = latPos;
        this.longPos = longPos;
    }

    public void setWaitingPassengers(int waitingPassengers) {
        this.waitingPassengers = waitingPassengers;
    }

    public int getStopID() {
        return this.stopID;
    }

    public String getName() {
        return this.name;
    }

    public double getLatPos() {
        return this.latPos;
    }

    public double getLongPos() {
        return this.longPos;
    }

    public int getWaitingPassengers() {
        return this.waitingPassengers;
    }


    public double distanceTo(Stop next) {
        return 70.0 * Math.sqrt(Math.pow((this.latPos - next.getLatPos()), 2) + Math.pow((this.longPos - next.getLongPos()), 2));
    }


}