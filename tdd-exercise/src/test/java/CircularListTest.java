import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import tdd.CircularList;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    @Test
    void testEmptyCircularListCreation() {
        final CircularList list = new CircularListImpl(
            Collections.emptyList()
        );
        assertTrue(list.isEmpty());
    }

    @Test
    void testNonEmptyCircularListCreation() {
        final List<Object> elements = List.of(10, 20, 30);
        final CircularList list = new CircularListImpl(elements);

        assertFalse(list.isEmpty());
    }
}
