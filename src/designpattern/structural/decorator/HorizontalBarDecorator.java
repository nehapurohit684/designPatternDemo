package designpattern.structural.decorator;

public class HorizontalBarDecorator extends WindowDecorator{

    HorizontalBarDecorator(Window w){
        this.window=w;
    }

    @Override
    public void draw() {
        System.out.println("Horizontal Bar added");
        window.draw();
    }
}
