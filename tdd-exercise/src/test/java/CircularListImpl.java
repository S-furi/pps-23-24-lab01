import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import tdd.CircularList;

public class CircularListImpl implements CircularList {
    private final List<Integer> list;
    private ListIterator<Integer> listIterator;

    public CircularListImpl(final List<Integer> list) {
        this.list = new ArrayList<>(list);
        this.listIterator = this.list.listIterator();
    }

    @Override
    public void add(final int element) {
        this.list.add(element);
        this.listIterator = list.listIterator();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public Optional<Integer> next() {
        if (!this.listIterator.hasNext()) {
            this.listIterator = this.list.listIterator();
        }
        return Optional.of(this.listIterator.next());
    }

    @Override
    public Optional<Integer> previous() {
        if (!this.listIterator.hasPrevious()) {
            this.listIterator = this.list.listIterator(this.list.size());
        }
        return Optional.of(this.listIterator.previous());
    }

    @Override
    public void reset() {
        this.listIterator = this.list.listIterator();
    }

}
