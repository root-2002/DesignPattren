package Exercise.report;

import Exercise.Employee;
import Exercise.report.BudgetCalculator.BudgetCalculator;
import Exercise.report.BudgetCalculator.StuffBudget;

import java.util.List;

public class ReportBudgetStuff extends ReportEmployee{
    public ReportBudgetStuff(List<Employee> employees) {
        super(employees);
    }

    @Override
    public String getReport() {
        BudgetCalculator budgetCalculator=new StuffBudget(employees);

        return "the budget for all Stuff is"+ budgetCalculator.calculateBudget();
    }
}
