package designpattern.behavioral.visitor;

public class Light implements Appliance {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
