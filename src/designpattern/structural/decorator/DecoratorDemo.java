package designpattern.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Window myWindow = new HorizontalBarDecorator(new SimpleWindow());
        myWindow.draw();
    }
}
