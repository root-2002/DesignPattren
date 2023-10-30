package Exercise.report.BudgetCalculator;

import Exercise.Employee;

import java.util.List;

public class Calculator implements BudgetCalculator{
    List<Employee> employees;
    double budget;
    Calculator(List<Employee> employees){
        this.employees= employees;
    }
    @Override
    public double calculateBudget() {
        for(Employee e:employees){
            budget+=e.getCompletedHours();
        }
        return budget;
    }
}
