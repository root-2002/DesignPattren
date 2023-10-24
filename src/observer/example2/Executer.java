package observer.example2;

public class Executer {
    public static void main(String[] args) {
        Person p =new Person("ameed");
        Person p2 =new Person("ahmde");
        Person p3 =new Person("amer");
        Person p4 =new Person("mnaer");
        Product pr =new Product("Java");
        pr.subscribe(p);
        pr.subscribe(p2);
        pr.subscribe(p4);
        pr.setAvailability(true);

    }
}
