package designpattern.behavioral.observer;

public class Follower1 extends Observer {

    Follower1(Subject subject){
        sub = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Message Received" );
    }
}
