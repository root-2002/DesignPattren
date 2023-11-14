package singelton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton2 {
    Integer[]num={1,2,3,4};
    List<Integer> number= Arrays.asList(num);
    private static volatile Singleton2 instance;

    public static Singleton2 getInstance() {

        if(instance == null){
            synchronized(Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    Singleton2(){
        System.out.println("Singel cons");
        Collections.shuffle(number);
        System.out.println(this.hashCode());
    }
    public void print(){
        System.out.println(number);
        this.hashCode();
    }
}
