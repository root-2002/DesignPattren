package factory;

public class SandwichFactory {
    public static final int CHEESE_BURGER =1;
    public static final int BEEF_BURGER =2;

    public static Sandwich createSandwich(int Id){
        switch (Id){
            case CHEESE_BURGER:
                return new CheeseBurger();
            case BEEF_BURGER:
                return new BeefBurger();
            default:
                return null;
        }
    }
}
