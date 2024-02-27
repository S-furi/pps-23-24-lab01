import org.junit.jupiter.api.Test;

import tdd.iterator.CircularListIteratorImpl;
import tdd.iterator.CiruclarListIterator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;

public class CircularListIteratorTest {

    @Test
    void testCreation() {
        final CiruclarListIterator list = new CircularListIteratorImpl(
            Collections.emptyList()
            );
    }

    @Test
    void testEmptyList() {
        final CiruclarListIterator list = new CircularListIteratorImpl(
            Collections.emptyList()
        );
        assertTrue(list.isEmpty());
    }
}