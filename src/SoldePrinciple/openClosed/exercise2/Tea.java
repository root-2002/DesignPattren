package SoldePrinciple.openClosed.exercise2;

public class Tea implements Drink{

    @Override
    public String makeDrink() {
        return "Tea is created";
    }

    @Override
    public double getCost() {
        return 3;
    }
}
