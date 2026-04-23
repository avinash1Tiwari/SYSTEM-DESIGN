package que1.utils;

import que1.model.Expense;

import java.util.List;

public class ExpenseUtils {

    public static boolean areAllExpenseOfSameTrip(List<Expense> expenses)
    {

        int id = expenses.get(0).getTrip_id();

        for(Expense expense : expenses)
        {
            if(expense.getTrip_id() != id)
            {
                return false;
            }
        }

        return true;
    }
}
