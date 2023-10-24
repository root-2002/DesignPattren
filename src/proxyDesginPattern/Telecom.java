package proxyDesginPattern;

public class Telecom implements ISP {
    public int browsingSpeed =10;

    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

    public void setBrowsingSpeed(int browsingSpeed) {
        this.browsingSpeed = browsingSpeed;
    }

    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com",url);
    }
}
