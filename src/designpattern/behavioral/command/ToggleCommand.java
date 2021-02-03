package designpattern.behavioral.command;

public class ToggleCommand implements Command{

    Light light;

    public ToggleCommand(Light light){
        this.light =light;
    }

    @Override
    public void execute() {
        if(!light.isOn) light.on();
    }
}
