package que1.services.rule.impl;

import que1.model.Expense;
import que1.model.Violation;
import que1.services.rule.TripRules;
import que1.utils.ExpenseUtils;

import java.util.List;
import java.util.Optional;

public class TripTotalMaxRule implements TripRules {

    public double maxAmount;

    public TripTotalMaxRule(double maxAmount)
    {
        this.maxAmount = maxAmount;
    }

    @Override
    public Optional<Violation> check(List<Expense> expenses) {
        double result = 0.0;

        if(!ExpenseUtils.areAllExpenseOfSameTrip(expenses))
        {
            return Optional.of(new Violation("Given expenses do not belong to the same trip_id"));
        }


        for(Expense expense : expenses)
        {
            result += expense.getExpanseAmount();
        }

        if(result > maxAmount)
        {
            return Optional.of(new Violation("total expense exceeds the max Mount allocated for trip"));
        }

        return Optional.empty();
    }
}
