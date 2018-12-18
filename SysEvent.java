public class SysEvent {
    private int time;
    private int eventID;

    private String type;

    public SysEvent(int time, String type, int eventID) {
        this.time = time;
        this.type = type;
        this.eventID = eventID;
    }

    public int getTime() {
        return this.time;
    }

    public int getID(){
        return this.eventID;
    }

    public String getType() {
        return this.type;
    }

}


