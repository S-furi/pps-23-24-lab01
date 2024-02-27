import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.iterator.CircularListIteratorImpl;
import tdd.iterator.CiruclarListIterator;

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
}