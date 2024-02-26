import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.CircularList;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {
    private final List<Integer> elements = List.of(10, 20, 30);
    private CircularList list ;

    @BeforeEach
    void setUp() {
        this.list = new CircularListImpl(elements);
    }

    @Test
    void testEmptyCircularListCreation() {
        this.list = new CircularListImpl(Collections.emptyList());
        assertTrue(list.isEmpty());
    }

    @Test
    void testNonEmptyCircularListCreation() {
        assertFalse(list.isEmpty());
    }

    @Test
    void testNonEmptyCircularListSize() {
        assertEquals(this.elements.size(), list.size());
    }

    @Test
    void testAdd() {
        int newElement = 420;
        this.list.add(newElement);
        assertEquals(this.elements.size() + 1, this.list.size());
    }

    @Test
    void testForwardIteration() {
        final Iterator<Integer> expectedElements = this.elements.iterator();
        assertEquals(expectedElements.next(), this.list.next().get());
    }

    @Test
    void testCircularForwardIteration() {
        final int headElement = this.elements.get(0);
        IntStream.range(0, this.list.size()).forEach(i -> this.list.next());
        assertEquals(Optional.of(headElement), this.list.next());
    }

    @Test
    void testBackwardIteration() {
        final int expectedElement = this.elements.get(0);
        this.list.next();
        final int current = this.list.previous().get();
        assertEquals(expectedElement, current);
    }

    @Test
    void testCircularBackwardIteration() {
        final int lastElement = this.elements.get(this.elements.size() - 1);
        assertEquals(lastElement, this.list.previous().get());
    }
}
