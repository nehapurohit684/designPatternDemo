package designpattern.structural.proxy;

public class TwitterServiceStub implements TwitterService{
    @Override
    public String getTimeline(String screenName) {
        return "my timeline";
    }
}
