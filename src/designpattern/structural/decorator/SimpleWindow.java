package designpattern.structural.decorator;

public class SimpleWindow implements Window{
    @Override
    public void draw() {
        System.out.println("Simple Window");
    }
}
