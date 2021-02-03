package designpattern.behavioral.observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class TweetStream extends Subject {

    Deque<String> tweetsHistory = new ArrayDeque<>();

    @Override
    String getState() {
        return tweetsHistory.getFirst();
    }

    @Override
    void setState(String state) {
        tweetsHistory.add(state);
        this.notifyObservers();
    }
}
