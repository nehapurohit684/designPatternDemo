package designpattern.behavioral.state;

public class PlayState extends State {

    PlayState(Appliance appliance){
        super(appliance);
    }


    @Override
    void onChange() {
        System.out.println("Current State in on.");
        appliance.changeState(new OffState(appliance));
    }
}
