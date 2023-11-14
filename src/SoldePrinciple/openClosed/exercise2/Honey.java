package SoldePrinciple.openClosed.exercise2;

public class Honey implements Drink{
    Drink drink;
    Honey(Drink drink){
        this.drink =drink;
    }
    @Override
    public String makeDrink() {
        return drink.makeDrink()+" Withe honey";
    }

    @Override
    public double getCost() {
        return getCost()+2;
    }
}
