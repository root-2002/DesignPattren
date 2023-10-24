package proxyDesginPattern;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("facebook","instagram","porno","cnn","test");
        ISP internet = new internetProxy();
        for(String string:sites){
            System.out.println(internet.serverSite((string)));
        }
    }
}
