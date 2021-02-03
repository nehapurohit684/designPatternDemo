package designpattern.behavioral.command;

public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();
        Switch broker = new Switch();
        ToggleCommand command = new ToggleCommand(light);
        broker.storeAndExecute(command);


    }
}
