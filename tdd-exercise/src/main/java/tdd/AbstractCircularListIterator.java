package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import tdd.iterator.CiruclarListIterator;

public class AbstractCircularListIterator implements CiruclarListIterator {
    private final List<Integer> list;

    public AbstractCircularListIterator(final List<Integer> list) {
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

    protected List<Integer> getElements() {
        return List.copyOf(this.list);
    }
}
