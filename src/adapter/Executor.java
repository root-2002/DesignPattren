package adapter;

public class Executor {
    public static void main(String[] args) {
        Vehicle car = new Car();
        palyVechicle(car);
        Vehicle bicycle =new BicycleAdapter(new Bicycle()) ;
        palyVechicle(bicycle);


    }
    private static void palyVechicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.pushBreak();
        vehicle.soundHorn();
    }
}
