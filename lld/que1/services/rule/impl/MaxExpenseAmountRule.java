package que1.services.rule.impl;

import que1.model.Expense;
import que1.model.Violation;
import que1.services.rule.ExpenseRule;

import java.util.Optional;

public class MaxExpenseAmountRule implements ExpenseRule {

    private Double maxAmount;

    public MaxExpenseAmountRule(Double maxAmount)
    {
        this.maxAmount = maxAmount;
    }

    @Override
    public Optional<Violation> check(Expense e) {

        if(e.getExpanseAmount() > maxAmount)
        {
            Optional<Violation> res = Optional.of(new Violation("max amount exceeds"));
            return res;
        }

        return Optional.empty();
    }
}
