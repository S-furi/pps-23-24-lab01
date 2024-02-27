package tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularIteratorFactory {
    public static CircularIterator forwardIterator(final List<Integer> list) {
        return new CircularIteratorImpl(list);
    }

    public static CircularIterator backwardIterator(final List<Integer> list) {
        final List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return new CircularIteratorImpl(reversed);
    }
}
