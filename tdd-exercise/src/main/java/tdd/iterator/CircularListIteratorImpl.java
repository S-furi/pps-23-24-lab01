package tdd.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tdd.CircularIteratorFactory;

public class CircularListIteratorImpl implements CiruclarListIterator {
    private final List<Integer> list;

    public CircularListIteratorImpl(final List<Integer> list) {
        this.list = new ArrayList<Integer>(list);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public void add(final int element) {
        this.list.add(element);
    }

    @Override
    public Iterator<Integer> forwardIterator() {
        return CircularIteratorFactory.forwardIterator(this.list);
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return CircularIteratorFactory.backwardIterator(this.list);
    }
}
