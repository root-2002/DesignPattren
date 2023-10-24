package singelton;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class singel {
    private Integer[] numbers={1,2,3,4,56,8};
    private List<Integer> list = Arrays.asList(numbers);
    private static singel instance;
    public static singel gitInstance()
    {
        if(instance == null)
        {
            instance =new singel();
        }
        return instance;
    }
    private singel(){
        System.out.println("Singel cons");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }
    public void print()
    {
        for(Integer i :list)
        {
            System.out.print(i.toString() +" ");
        }
        System.out.println();
    }
}
