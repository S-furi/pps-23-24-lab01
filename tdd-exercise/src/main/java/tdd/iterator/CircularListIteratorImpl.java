package tdd.iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
        return new CircularIteratorImpl(this.list);
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        final List<Integer> copy = new ArrayList<>(this.list);
        Collections.reverse(copy);
        return copy.iterator();
    }
}
