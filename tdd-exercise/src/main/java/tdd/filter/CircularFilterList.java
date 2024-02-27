package tdd.filter;

import java.util.Optional;
import java.util.function.Predicate;

public interface CircularFilterList {

    Optional<Integer> filteredNext(Predicate<Integer> condition);

}
