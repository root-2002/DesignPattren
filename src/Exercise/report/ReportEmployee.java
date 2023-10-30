package Exercise.report;

import Exercise.Employee;

import java.util.List;

public class ReportEmployee implements Report{
    List<Employee> employees;
    String temp;
    public ReportEmployee(List<Employee> employees){
        this.employees=employees;
    }

    @Override
    public String getReport() {

        return "Report";
    }
}
