package Exercise.report;

import Exercise.Employee;

public class ReportEmployee implements Report{


    public String getReport(Employee employee) {
        return String.format("Job title: %s, Name: %s, Identification number: %d, Age: %d, Number of hours worked: %.2f, Number of hours completed: %.2f",
                employee.getClass().getSimpleName(),
                employee.getName(),
                employee.getId(),
                employee.getAge(),
                employee.getHourly(),
                employee.getCompletedHours()
        );

    }
}
