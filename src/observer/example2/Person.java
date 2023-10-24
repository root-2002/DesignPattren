package observer.example2;

public class Person implements Observer {
    private String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+" you have new message " + message);
    }
}
