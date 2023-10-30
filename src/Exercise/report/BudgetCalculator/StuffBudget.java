package Exercise.report.BudgetCalculator;

import Exercise.Employee;

import java.util.List;

public class StuffBudget extends Calculator{
    public StuffBudget(List<Employee> employees) {
        super(employees);
    }

   @Override
    public double calculateBudget() {
        return super.calculateBudget()*11;
    }
}
