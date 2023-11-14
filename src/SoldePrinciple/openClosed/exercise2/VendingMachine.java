package SoldePrinciple.openClosed.exercise2;

public class VendingMachine {
    public static void main(String[] args) {
        Drink myDrink =new Milk(new Honey(new Tea())) ;
        System.out.println(myDrink.makeDrink());
    }
}
