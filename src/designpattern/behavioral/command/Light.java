package designpattern.behavioral.command;

public class Light {

    public boolean isOn = false;

    public void on(){
        isOn =true;
        System.out.println("Light is On");
    }
    public void off(){
        isOn =false;
        System.out.println("Light is Off");
    }
}
