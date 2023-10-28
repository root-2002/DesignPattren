package Exercise;

import java.util.List;

public class Director extends Employee{
    List<Manager>managers;
    List<Stuff>stuffs;

    public Director(int id, String name, int age, int hourly, double completedHours) {
        super(id, name, age, hourly, completedHours);
    }
    void addManager(Manager manager){
        this.managers.add(manager);
    }
    void addStuff(Stuff stuff){
        this.stuffs.add(stuff);
    }
}
