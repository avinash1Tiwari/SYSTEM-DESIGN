package que1.services.rule;

import que1.model.Expense;
import que1.model.Violation;

import java.util.Optional;

public interface ExpenseRule {

    public Optional<Violation> check(Expense e);
}
