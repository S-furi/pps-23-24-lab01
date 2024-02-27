package tdd.iterator;

import java.util.List;
import java.util.Iterator;

public class CircularIteratorImpl implements CircularIterator {
    private final List<Integer> list;
    private Iterator<Integer>  iterator;

    public CircularIteratorImpl(final List<Integer> list) {
        this.list = list;
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (!this.iterator.hasNext()) {
            this.iterator = list.iterator();
        }
        return this.iterator.next();
    }

}
