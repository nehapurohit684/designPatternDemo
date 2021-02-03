package designpattern.behavioral.state;

public class Appliance {

    State state;

    Appliance(){
        this.state = new PlayState(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
