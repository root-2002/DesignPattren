package Exercise.fackeDb;

import Exercise.Director;
import Exercise.Employee;
import Exercise.Manager;
import Exercise.Stuff;

import java.util.ArrayList;
import java.util.List;

public class FDB {
    List<Employee> stuffs;
    List<Employee>directors;
    List<Employee>managers;
    private static FDB instance =new FDB();
    private FDB(){
        stuffs =new ArrayList<>();
        directors =new ArrayList<>();
        managers =new ArrayList<>();
        Stuff stuff =new Stuff(1,"Stuff A",20,100,105);
        Stuff stuff1 =new Stuff(1,"Stuff B",25,100,60);
        Stuff stuff2 =new Stuff(1,"Stuff C",29,100,90);
        Stuff stuff3 =new Stuff(1,"Stuff D",27,100,70);
        Stuff stuff4 =new Stuff(1,"Stuff E",30,100,80);
        Director director =new Director(1,"Director A",40,50,70);
        Director director1 =new Director(2,"Director B",50,150,70);
        Director director2 =new Director(3,"Director C",48,250,70);
        Director director3 =new Director(4,"Director D",43,950,70);
        Director director4 =new Director(5,"Director E",47,350,70);
        Manager manager =new Manager(1,"Manager A",50,90,80);
        Manager manager1 =new Manager(2,"Manager B",50,90,80);
        Manager manager2 =new Manager(3,"Manager C",50,90,80);
        Manager manager3 =new Manager(4,"Manager D",50,90,80);
        Manager manager4 =new Manager(5,"Manager E",50,90,80);
        stuffs.add(stuff);
        stuffs.add(stuff1);
        stuffs.add(stuff2);
        stuffs.add(stuff3);
        stuffs.add(stuff4);
        managers.add(manager);
        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);
        managers.add(manager4);
        directors.add(director);
        directors.add(director1);
        directors.add(director2);
        directors.add(director3);
        directors.add(director4);
    }

    public List<Employee> getStuffs() {
        return stuffs;
    }

    public List<Employee> getDirectors() {
        return directors;
    }

    public List<Employee> getManagers() {
        return managers;
    }

    public static FDB getInstance() {
        return instance;
    }
    public void addManager(Manager manager){
        this.managers.add(manager);
    }
    public void addStuff(Stuff stuff){
        this.stuffs.add(stuff);
    }
    public void assDirector(Director director){
        this.directors.add(director);
    }

}
