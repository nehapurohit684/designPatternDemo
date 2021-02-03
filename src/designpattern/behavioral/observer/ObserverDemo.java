package designpattern.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        TweetStream message = new TweetStream();
        Follower1 p1 = new Follower1(message);
        Follower2 t1 = new Follower2(message);
        message.setState("Hello");
    }
}
