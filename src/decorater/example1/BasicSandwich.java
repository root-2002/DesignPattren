package decorater.example1;

public class BasicSandwich implements Sandwich{
    @Override
    public double getCost() {
        return 20.4;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
