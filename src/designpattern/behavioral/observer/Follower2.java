package designpattern.behavioral.observer;

public class Follower2 extends Observer{

    Follower2(Subject subject){
        sub = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Message Received Follower2");
    }
}
