package designpattern.behavioral.state;

public class OffState extends State {

    public OffState(Appliance appliance) {
        super(appliance);
    }

    @Override
    void onChange() {
        System.out.println("Current State is off");
        appliance.changeState(new PlayState(appliance));
    }
}
