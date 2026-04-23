package que1.services.rule;


import que1.model.Expense;
import que1.model.Violation;

import java.util.List;
import java.util.Optional;

public interface TripRules {

    Optional<Violation> check(List<Expense> expenses);
}
