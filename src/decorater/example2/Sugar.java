package decorater.example2;

public class Sugar extends CoffeeMachine{
    public Sugar(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost(){
        return super.getCost()+2;
    }
    public  String getTheBehavior(){
        return super.getTheBehavior()+" with Sugar";
    }
}
