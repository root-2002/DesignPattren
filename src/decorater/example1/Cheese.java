package decorater.example1;

public class Cheese extends SandwichDecorater {
    public Cheese(Sandwich sandwich)
    {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost()+2.5;
    }
}
