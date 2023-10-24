package decorater.example1;

public class Beef extends SandwichDecorater{
 public Beef(Sandwich sandwich)
 {
     super(sandwich);
 }

    @Override
    public double getCost() {
        return super.getCost()+5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ,Beef";
    }
}
