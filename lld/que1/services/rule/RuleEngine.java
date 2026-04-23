package que1.services.rule;

import que1.model.ExpanseType;
import que1.model.Expense;
import que1.model.Violation;
import que1.utils.ExpenseUtils;

import java.util.List;
import java.util.Map;

public interface RuleEngine {

    List<Violation> evaluate(

                    List<Expense> expenses,
                    Map<ExpanseType,List<ExpenseRule>> expenseRuleRegistry,
                    List<ExpenseRule> allExpenseRuleRegistry,
                    List<TripRules> tripRuleExpenses
    );
}
