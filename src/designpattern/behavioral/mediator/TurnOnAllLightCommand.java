package designpattern.behavioral.mediator;

import designpattern.behavioral.command.Command;

public class TurnOnAllLightCommand implements Command {
    Mediator mediator;

    public TurnOnAllLightCommand(Mediator mediator) {
        this.mediator =mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
