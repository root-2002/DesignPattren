package proxyDesginPattern;

import java.util.Arrays;
import java.util.List;

public class internetProxy implements ISP{
    private List<String> blockSites = Arrays.asList("facebook","instagram","porno");
    @Override
    public String serverSite(String url) {
       if(blockSites.contains(url)){
           return "Naughty Boy this sites is blocked";
       }
    return new Telecom().serverSite(url);
    }
    private void logSite(String url){
        System.out.printf("[%d] %s",System.currentTimeMillis(),url);
    }
}
