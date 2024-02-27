import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.iterator.CircularListIteratorImpl;
import tdd.iterator.CiruclarListIterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CircularListIteratorTest {
    private CiruclarListIterator list;
    private List<Integer> elements;

    @BeforeEach
    void setUp() {
        this.elements = List.of(10, 20, 30);
        this.list = new CircularListIteratorImpl(elements);
    }

    @Test
    void testCreation() {
        assertNotNull(this.list);
    }

    @Test
    void testEmptyList() {
        final CiruclarListIterator list = new CircularListIteratorImpl(
            Collections.emptyList()
            );
        assertTrue(list.isEmpty());
    }

    @Test
    void testNonEmptyList() {
        assertFalse(this.list.isEmpty());
    }

    @Test
    void testNonEmptyListSizeMustBeGreaterThanZero() {
        assertNotEquals(0, this.list.size());
        assertEquals(this.elements.size(), this.list.size());
    }

    @Test
    void testAdd() {
        this.list.add(420);
        assertEquals(this.elements.size() + 1, this.list.size());
    }

    @Test
    void testSimpleForwardIteration() {
        final Iterator<Integer> circularIterator = this.list.forwardIterator();
        final Iterator<Integer> expectedIterator = this.elements.iterator();

        assertTrue(checkIteratorsEquality(expectedIterator, circularIterator));
    }

    @Test
    void testBackwardOverlap() {
        assertEquals(this.elements.get(this.elements.size() - 1), this.list.backwardIterator().next());
    }

    @Test
    void testSimpleBackwardIteration() {
        final Iterator<Integer> circularIterator = this.list.backwardIterator();
        final Iterator<Integer> expectedIterator = getReversedList(this.elements).iterator();

        assertTrue(checkIteratorsEquality(expectedIterator, circularIterator));
    }

    private List<Integer> getReversedList(final List<Integer> list) {
        final List<Integer> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }

    private boolean checkIteratorsEquality(final Iterator<Integer> expected, final Iterator<Integer> actual) {
        while (actual.hasNext()) {
            if (!expected.next().equals(actual.next())) {
                return false;
            }
        }
        return true;
    }
}