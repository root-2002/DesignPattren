package Exercise.report;

import Exercise.Employee;
import Exercise.report.BudgetCalculator.BudgetCalculator;
import Exercise.report.BudgetCalculator.DirectorBudget;
import Exercise.report.BudgetCalculator.StuffBudget;

import java.util.List;

public class ReportDirectorBudget extends ReportEmployee{
    public ReportDirectorBudget(List<Employee> employees) {
        super(employees);
    }
    @Override
    public String getReport() {
        BudgetCalculator budgetCalculator=new DirectorBudget(employees);

        return "the budget for all Director is"+ budgetCalculator.calculateBudget();
    }
}
