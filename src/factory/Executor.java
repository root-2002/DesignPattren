package factory;

public class Executor {
    public static void main(String[] args) {
        Sandwich s = SandwichFactory.createSandwich(SandwichFactory.BEEF_BURGER);
        s.prepare();
        Sandwich s2 = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        s2.prepare();
    }
}
