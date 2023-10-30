package Exercise;

import Exercise.fackeDb.FDB;
import Exercise.report.Report;
import Exercise.report.ReportEmployee;
import Exercise.report.generateReport;

import java.util.List;

public class Executor {
    public static void main(String[] args) {

        FDB db =FDB.getInstance();
        List<Employee> employees = db.getDirectors();
        Report report =new generateReport(employees);
        System.out.println(employees.get(1).getClass().getSimpleName());

    }
}
