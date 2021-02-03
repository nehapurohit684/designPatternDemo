package designpattern.behavioral.mediator;

import designpattern.behavioral.command.Light;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    List<Light> lights = new ArrayList<>();

    public void registe(Light light){
        lights.add(light);
    }

    public void turnOnAllLights(){
        for (Light l:lights) {
            if(!l.isOn){
                l.on();
            }
        }
    }

    public void turnOffAllLights(){
        for (Light l:lights) {
            if(l.isOn){
                l.off();
            }
        }
    }
}
