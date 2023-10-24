package decorater.example2;

public class Ovary extends CoffeeMachine{
    public Ovary(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double getCost() {
        return super.getCost()+2;
    }

    @Override
    public String getTheBehavior() {
        return super.getTheBehavior()+" and with Ovary";
    }
}
