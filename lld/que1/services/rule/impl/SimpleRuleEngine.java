package que1.services.rule.impl;

import que1.model.ExpanseType;
import que1.model.Expense;
import que1.model.Violation;
import que1.services.rule.ExpenseRule;
import que1.services.rule.RuleEngine;
import que1.services.rule.TripRules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SimpleRuleEngine implements RuleEngine {


    @Override
    public List<Violation> evaluate( List<Expense> expenses, Map<ExpanseType, List<ExpenseRule>> expenseRuleRegistry, List<ExpenseRule> allExpenseRuleRegistry, List<TripRules> tripRuleExpenses) {

//
        List<Violation> violations = new ArrayList<>();

//        1. check all expenses against all rules
        for(Expense expense : expenses)
        {
            List<ExpenseRule> rules = expenseRuleRegistry.getOrDefault(expense.getExpanseType(),List.of());

            checkExpenseAgainstRule(expense,rules,violations);
            checkExpenseAgainstRule(expense,allExpenseRuleRegistry,violations);

        }

//       check all expense against all trip rules
        for(TripRules tripRules : tripRuleExpenses)
        {
            Optional<Violation> violation1 = tripRules.check(expenses);
            if(violation1.isPresent())
            {
                violations.add(violation1.get());
            }
        }

        return violations;
    }


    private void checkExpenseAgainstRule(Expense expense,List<ExpenseRule> rules,List<Violation> violations )
    {
        for(ExpenseRule rule : rules)
        {
            Optional<Violation> violation = rule.check(expense);
            if(violation.isPresent())
            {
                violations.add(violation.get());
            }
        }
    }
}
