import java.util.PriorityQueue;

public class SysHeap {
    private static PriorityQueue<SysEvent> heap;

    public SysHeap() {
        heap = new PriorityQueue<SysEvent>(250, new SysEventComparator());
    }

    public static void addEvent(int time, String type, int eventID) {
        heap.add(new SysEvent(time, type, eventID));
    }

    public static void nextEvent(MetroSystem system) {
        if (heap.size() > 0) {
            SysEvent current = heap.poll();
            if (current.getType().equals("move_bus")) {
                int currentBusID = current.getID();
                Bus currentBus = system.getBus(currentBusID);

                int currentIndex = currentBus.getRouteIndex();
                Route currentRoute = system.getRoute(currentBus.getRoute());

                int nextIndex = currentRoute.getNextIndex(currentIndex);
                int nextStopID = currentRoute.getStopID(nextIndex);

                Stop currentStop = system.getStop(currentRoute.getStopID(currentIndex));

                Double distance = currentStop.distanceTo(system.getStop(nextStopID));

                int nextTime = 1 + distance.intValue() * 60 / currentBus.getSpeed();

                currentBus.setRouteIndex(nextIndex);

                heap.add(new SysEvent(nextTime + current.getTime(), "move_bus", currentBusID));
                System.out.println("b:"+currentBusID+"->s:"+nextStopID+"@"+(nextTime+current.getTime())+"//p:0/f:0");

            }
            else {
                System.out.println(current.getType());
                System.out.println("bad event type");
            }
        }
    }


}
