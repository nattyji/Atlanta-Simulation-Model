import java.util.Comparator;

public class SysEventComparator implements Comparator<SysEvent> {
    @Override
    public int compare(SysEvent x, SysEvent y) {
        return x.getTime() - y.getTime();
    }
}