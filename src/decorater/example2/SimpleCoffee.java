package decorater.example2;

public class SimpleCoffee  implements Coffee {


    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getTheBehavior() {
        return "dark Coffee";
    }

    @Override
    public void print() {

        System.out.println("Your order :"+getTheBehavior());
        System.out.println("total cost"+getCost());
    }
}
