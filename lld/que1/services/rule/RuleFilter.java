package que1.services.rule;

import que1.model.ExpanseType;
import que1.model.Expense;
import que1.model.Violation;
import que1.registry.ExpanseMapping;
import que1.services.rule.impl.SimpleRuleEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RuleFilter {

    public static void main(String[] args) {

        List<Expense> expenses = new ArrayList<>();
//        Expense e = new Expense(1,"stay", ExpanseType.RESTAURANT,70.0);
        Expense e1 = new Expense("AIRWAYS", ExpanseType.AIRFARE,79.0,1);
        Expense e2 = new Expense("RESTAURANT", ExpanseType.RESTAURANT,20.0,1);
        Expense e3 = new Expense("RESTAURANT", ExpanseType.RESTAURANT,4000.0,1);
        Expense e4 = new Expense("AIRWAYS", ExpanseType.ENTERTAINMENT,30.0,1);
        expenses.add(e1);
        expenses.add(e2);
        expenses.add(e3);
        expenses.add(e4);

        List<Violation> violation_result = new SimpleRuleEngine().evaluate(expenses,ExpanseMapping.getMapping(),ExpanseMapping.getAllExpenseRuleRegistry(),ExpanseMapping.getTripExpenseRuleRegistry());

        for(Violation vv : violation_result)
        {
            System.out.println("from driver");
            System.out.println(vv.getMessage());
        }

    }
}
