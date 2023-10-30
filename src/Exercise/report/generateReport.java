package Exercise.report;

import Exercise.Employee;

import java.util.List;

public class generateReport extends ReportEmployee{
    public generateReport(List<Employee> employees) {
        super(employees);
    }
    @Override
    public String getReport() {
        String report ="";
        for(Employee e:employees){
            report +=String.format("Job title: %s, Name: %s, Identification number: %d, Age: %d, Number of hours worked: %.2f, Number of hours completed: %.2f\n",
                    e.getClass().getSimpleName(),
                    e.getName(),
                    e.getId(),
                    e.getAge(),
                    e.getHourly(),
                    e.getCompletedHours()
            );
        }
        return report;
    }
}
