package Exercise;

public class Employee {
    int id;
    String name;
    int age;
    int hourly;
    double completedHours;

    public Employee(int id, String name, int age, int hourly, double completedHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourly = hourly;
        this.completedHours = completedHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHourly() {
        return hourly;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }

    public double getCompletedHours() {
        return completedHours;
    }

    public void setCompletedHours(double completedHours) {
        this.completedHours = completedHours;
    }
}
