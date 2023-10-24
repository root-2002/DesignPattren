package decorater.example2;

public class CoffeeMachine implements Coffee{
    Coffee coffee;
    public CoffeeMachine(Coffee coffee){
       this.coffee=coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost();
    }

    @Override
    public String getTheBehavior() {
        return this.coffee.getTheBehavior();
    }
    public void print(){

        System.out.println("Your order :"+getTheBehavior());
        System.out.println("total cost"+getCost());
    }
}
