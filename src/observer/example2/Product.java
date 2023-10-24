package observer.example2;
import java.util.ArrayList;
import java.util.List;
public class Product implements  Subject{
    private String name;
    private String availability;
    private List<Observer> subscribes;
    public Product(String name){
        this.name=name;
        subscribes=new ArrayList<>();
    }


    @Override
    public void subscribe(Observer observer) {
        subscribes.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribes.remove(observer);
    }
    public void setAvailability(boolean available)
    {
        this.availability = this.name + (available ? " Available" : " Not Available");
        notifyAllSubscribers();
    }
    @Override
    public void notifyAllSubscribers() {
    for(Observer i:subscribes){
        i.update(availability);
    }
    }
}
