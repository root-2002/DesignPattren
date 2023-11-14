package SoldePrinciple.openClosed.exercise2;

public class Coffee implements Drink{
    @Override
    public String makeDrink() {
        return "Coffee is created";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
