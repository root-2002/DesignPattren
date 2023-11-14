package SoldePrinciple.openClosed.exercise2;

public class Milk implements Drink{
    Drink drink;
    Milk(Drink drink){
        this.drink =drink;
    }
    @Override
    public String makeDrink() {
        return drink.makeDrink() +" Withe milk";
    }

    @Override
    public double getCost() {
        return drink.getCost()+1;
    }
}
