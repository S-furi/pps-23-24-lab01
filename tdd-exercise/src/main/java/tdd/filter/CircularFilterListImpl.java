package tdd.filter;
import java.util.List;

import tdd.AbstractCircularListIterator;

public class CircularFilterListImpl extends AbstractCircularListIterator implements CircularFilterList {

    public CircularFilterListImpl(final List<Integer> list) {
        super(list);
    }
}
