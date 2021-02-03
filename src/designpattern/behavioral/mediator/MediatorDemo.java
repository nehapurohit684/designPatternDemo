package designpattern.behavioral.mediator;

import designpattern.behavioral.command.Command;
import designpattern.behavioral.command.Light;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light kitchenLight = new Light();
        Light bedroonLight = new Light();
        mediator.registe(kitchenLight);
        mediator.registe(bedroonLight);

        Command cmd = new TurnOnAllLightCommand(mediator);
        cmd.execute();

    }



}
