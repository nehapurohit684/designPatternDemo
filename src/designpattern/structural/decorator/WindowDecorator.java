package designpattern.structural.decorator;

public abstract class WindowDecorator implements Window {

    Window window;

    @Override
    public void draw() {
       window.draw();
    }
}
