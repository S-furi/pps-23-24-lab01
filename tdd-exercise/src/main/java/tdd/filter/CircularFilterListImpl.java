package tdd.filter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import tdd.AbstractCircularListIterator;

public class CircularFilterListImpl extends AbstractCircularListIterator implements CircularFilterList {

    public CircularFilterListImpl(final List<Integer> list) {
        super(list);
    }

    @Override
    public Optional<Integer> filteredNext(final Predicate<Integer> condition) {
        return super.getElements().stream().filter(condition).findFirst();
    }
}
