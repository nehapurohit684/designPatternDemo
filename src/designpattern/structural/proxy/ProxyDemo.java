package designpattern.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        TwitterService proxy = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(proxy.getTimeline("neha"));
    }
}
