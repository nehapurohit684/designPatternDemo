package designpattern.behavioral.visitor;

public interface Visitor {
    void visit(Light l);
    void visit(Fan fan);
}
