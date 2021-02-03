package designpattern.behavioral.visitor;

public class OnCommandVisitor implements Visitor{

    @Override
    public void visit(Light l) {
        System.out.println("Appliance is on :" + l);
    }

    @Override
    public void visit(Fan f) {
        System.out.println("Appliance is on :" + f);
    }
}
