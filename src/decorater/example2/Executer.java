package decorater.example2;

public class Executer {
    public static void main(String[] args) {
        Coffee coffee =new SimpleCoffee();
        System.out.println(coffee.getCost());
        Coffee coffee1 =new Sugar(new SimpleCoffee());
        System.out.println(coffee1.getTheBehavior());
        System.out.println("new order :-");
        Coffee order1 = new Ovary(new Sugar(new SimpleCoffee()));
        order1.print();
    }
}
