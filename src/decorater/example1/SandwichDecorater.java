package decorater.example1;

public class SandwichDecorater implements Sandwich{
    private Sandwich sandwich;
    public SandwichDecorater(Sandwich sandwich)
    {
        this.sandwich= sandwich;
    }

    @Override
    public double getCost() {
        return this.sandwich.getCost();
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription();
    }
}
