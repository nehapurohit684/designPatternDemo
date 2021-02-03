package designpattern.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        Light light1 = new Light();
        Fan fan1 = new Fan();
        light1.accept(new OnCommandVisitor());
        fan1.accept(new OnCommandVisitor());
        //light1.accept(new OnCommandVisitor());

    }




}
