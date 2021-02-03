package designpattern.behavioral.visitor;

public class Fan implements Appliance{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
