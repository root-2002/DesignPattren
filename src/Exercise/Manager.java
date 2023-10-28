package Exercise;

import java.util.List;

public class Manager extends Employee {

    List<Stuff>stuffs;

    public Manager(int id, String name, int age, int hourly, double completedHours) {
        super(id, name, age, hourly, completedHours);
    }
    void addStuff(Stuff stuff){
        this.stuffs.add(stuff);
    }
}
