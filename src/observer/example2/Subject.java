package observer.example2;



public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllSubscribers();
}
