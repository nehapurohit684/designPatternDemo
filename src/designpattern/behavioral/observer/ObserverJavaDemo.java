package designpattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverJavaDemo {
    public static void main(String[] args) {
        MessageStream stream = new MessageStream();
        Follower client1 = new Follower();
        Follower client2 = new Follower();
        stream.addObserver(client1);
        stream.addObserver(client2);
        stream.tweet("Hello");
    }

    public static class MessageStream extends Observable {

        void tweet(String msg){
            setChanged();
            notifyObservers(msg);
        }

    }
    public static class Follower implements Observer {
        @Override
        public void update(Observable observable, Object o) {
            System.out.println("Message Received by: " +o);
        }
    }






}
