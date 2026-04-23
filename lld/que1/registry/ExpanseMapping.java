package que1.registry;

import que1.model.ExpanseType;
import que1.services.rule.ExpenseRule;
import que1.services.rule.TripRules;
import que1.services.rule.impl.DisAllowRule;
import que1.services.rule.impl.MaxExpenseAmountRule;
import que1.services.rule.impl.TripTotalMaxRule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpanseMapping {



    public static Map<ExpanseType, List<ExpenseRule>> getMapping()
    {
        Map<ExpanseType, List<ExpenseRule>> mapping = new HashMap<>();

        mapping.put(ExpanseType.AIRFARE,
                List.of(new DisAllowRule(),new MaxExpenseAmountRule(75.0))
                );

        mapping.put(ExpanseType.RESTAURANT,
                List.of(new MaxExpenseAmountRule(75.0)));

        return mapping;
    }

    public static List<ExpenseRule> getAllExpenseRuleRegistry()
    {
        return List.of(new MaxExpenseAmountRule(200.0));
    }

    public static List<TripRules> getTripExpenseRuleRegistry()
    {
        return List.of(new TripTotalMaxRule(300));
    }

}
