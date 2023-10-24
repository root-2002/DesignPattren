package decorater.example1;

public class Executer {
    public static void main(String[] args) {
        Sandwich mySnadwich = new BasicSandwich();
        System.out.println("Description :" + mySnadwich.getDescription());
        System.out.println("Cost =" + mySnadwich.getCost());



        System.out.println("Beef Sandwich :");
        Sandwich mySnadwich2 = new Beef(new BasicSandwich());
        System.out.println("Description :" + mySnadwich2.getDescription());
        System.out.println("Cost =" + mySnadwich2.getCost());



        System.out.println("Cheese Sandwich :");
        Sandwich mySnadwich3 = new Cheese(new BasicSandwich());
        System.out.println("Description :" + mySnadwich3.getDescription());
        System.out.println("Cost =" + mySnadwich3.getCost());


        System.out.println("Beef and Cheese Sandwich :");
        Sandwich mySnadwich4 =new Beef(new Cheese(new BasicSandwich()));
        System.out.println("Description :" + mySnadwich4.getDescription());
        System.out.println("Cost =" + mySnadwich4.getCost());
    }
}
