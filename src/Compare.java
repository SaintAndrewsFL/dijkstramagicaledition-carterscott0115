import java.util.Comparator;

public class Compare implements Comparator<Edge> {
    @Override
    public int compare(Edge o1, Edge o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}