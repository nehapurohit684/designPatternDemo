package designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    abstract String getState();
    abstract void setState(String state);

    List<Observer> followers = new ArrayList<>();

    public void attach(Observer observer) {
        followers.add(observer);
    }
    public void detach(Observer observer) {
        followers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o: followers) {
            o.update();
        }
    }
}
