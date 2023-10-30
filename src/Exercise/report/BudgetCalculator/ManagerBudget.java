package Exercise.report.BudgetCalculator;

import Exercise.Employee;

import java.util.List;

public class ManagerBudget extends Calculator{
    public ManagerBudget(List<Employee> employees) {
        super(employees);
    }
    @Override
    public double calculateBudget() {
        return super.calculateBudget()*15.5;
    }
}
