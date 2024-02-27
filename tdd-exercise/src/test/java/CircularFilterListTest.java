import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.filter.CircularFilterList;
import tdd.filter.CircularFilterListImpl;

public class CircularFilterListTest {

    private CircularFilterList list;
    private List<Integer> elements;

    @BeforeEach
    void setUp() {
        this.elements = List.of(10, 20, 30);
        this.list = new CircularFilterListImpl(this.elements);
    }

    @Test
    void testCreation() {
        final CircularFilterList newList = new CircularFilterListImpl(Collections.emptyList());
        assertNotNull(newList);
    }

    @Test
    void testPredicate() {
        final Optional<Integer> result = this.list.filteredNext(it -> it % 10 == 0);
        assertNotEquals(Optional.empty(), result);
        assertEquals(10, result.get());
    }

    @Test
    void testEmptyFilterResult() {
        final Optional<Integer> result = this.list.filteredNext(it -> it % 11 == 0);
        assertEquals(Optional.empty(), result);
    }
}
