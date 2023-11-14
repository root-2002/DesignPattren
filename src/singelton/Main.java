package singelton;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Singleton2 singleton2 = Singleton2.getInstance();
            singleton2.print();
        });
        Thread thread2 = new Thread(() -> {
            Singleton2 singleton3 = Singleton2.getInstance();
            System.out.println("Thread 1: " + singleton3.hashCode());
            singleton3.print();
        });
        thread1.start();
        thread2.start();

    }
}
