package observer.example;

public class Executor {
    public static void main(String[] args) {
        Student amer = new Student("amer");
        Student amer2 = new Student("amer2");
        Student amer3 = new Student("amer3");
        Course java = new Course("java Course");
        java.subscribe(amer);
        java.subscribe(amer2);

        java.setAvailability(true);
    }
}
