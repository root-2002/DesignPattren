package Exercise.report;

import Exercise.Employee;
import Exercise.report.BudgetCalculator.BudgetCalculator;
import Exercise.report.BudgetCalculator.ManagerBudget;
import Exercise.report.BudgetCalculator.StuffBudget;

import java.util.List;

public class ReportManagerBudget extends ReportEmployee{
    public ReportManagerBudget(List<Employee> employees) {
        super(employees);
    }
    @Override
    public String getReport() {
        BudgetCalculator budgetCalculator=new ManagerBudget(employees);

        return "the budget for all Stuff is"+ budgetCalculator.calculateBudget();
    }
}
