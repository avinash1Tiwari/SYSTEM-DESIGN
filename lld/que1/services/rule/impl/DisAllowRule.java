package que1.services.rule.impl;

import que1.model.Expense;
import que1.model.Violation;
import que1.services.rule.ExpenseRule;

import java.util.Optional;

public class DisAllowRule implements ExpenseRule {
    @Override
    public Optional<Violation> check(Expense e) {
        Optional<Violation> res = Optional.of(new Violation("Given expense : " + e.getExpanseName() + " is not eligible for reimbursement"));
        return res;
    }
}
