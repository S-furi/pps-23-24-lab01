package tdd.filter;
import java.util.List;

public class CircularFilterListImpl implements CircularFilterList {

    private final List<Integer> list;

    public CircularFilterListImpl(final List<Integer> list) {
        this.list = list;
    }
}
