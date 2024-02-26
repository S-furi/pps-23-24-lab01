import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import tdd.CircularList;

public class CircularListImpl implements CircularList {
    private final List<Integer> list;
    private Iterator<Integer> listIterator;

    public CircularListImpl(final List<Integer> list) {
        this.list = new ArrayList<>(list);
        this.listIterator = this.list.iterator();
    }

    @Override
    public void add(final int element) {
        this.list.add(element);
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
            this.listIterator = this.list.iterator();
        }
        return Optional.of(this.listIterator.next());
    }

    @Override
    public Optional<Integer> previous() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'previous'");
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

}
