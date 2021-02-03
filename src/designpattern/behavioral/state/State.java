package designpattern.behavioral.state;

public abstract class State {

    Appliance appliance;

    State(Appliance player) {
        this.appliance = player;
    }

    abstract void onChange();
}
