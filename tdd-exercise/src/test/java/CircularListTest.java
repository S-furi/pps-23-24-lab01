import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;

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
}
