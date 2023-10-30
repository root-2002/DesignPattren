package Exercise.report.BudgetCalculator;

import Exercise.Employee;

import java.util.List;

public class DirectorBudget extends Calculator{
    public DirectorBudget(List<Employee> employees) {
        super(employees);
    }
    @Override
    public double calculateBudget() {
        return super.calculateBudget()*18.75;
    }
}
