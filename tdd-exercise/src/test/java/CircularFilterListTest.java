import java.util.Collections;

import org.junit.jupiter.api.Test;

import tdd.filter.CircularFilterList;
import tdd.filter.CircularFilterListImpl;

public class CircularFilterListTest {

    @Test
    void testCreation() {
        final CircularFilterList list = new CircularFilterListImpl(Collections.emptyList());
    }
    
}
