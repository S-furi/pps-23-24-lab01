import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.iterator.CircularListIteratorImpl;
import tdd.iterator.CiruclarListIterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
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
}