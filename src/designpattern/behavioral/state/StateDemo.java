package designpattern.behavioral.state;

public class StateDemo {

    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.getState().onChange();
        appliance.getState().onChange();
    }
}
