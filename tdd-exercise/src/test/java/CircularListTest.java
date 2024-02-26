import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.CircularList;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {
    private final List<Object> elements = List.of(10, 20, 30);
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
}
