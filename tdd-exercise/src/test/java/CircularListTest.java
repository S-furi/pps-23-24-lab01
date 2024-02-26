import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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
}
