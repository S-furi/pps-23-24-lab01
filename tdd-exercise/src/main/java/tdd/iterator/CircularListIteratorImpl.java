package tdd.iterator;
import java.util.Iterator;
import java.util.List;

public class CircularListIteratorImpl implements CiruclarListIterator {
    private final List<Integer> list;

    public CircularListIteratorImpl(final List<Integer> list) {
        this.list = list;
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
    public Iterator<Integer> forwardIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forwardIterator'");
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'backwardIterator'");
    }

    @Override
    public void add(int element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
