package designpattern.behavioral.memento;

import java.util.Stack;

public class CareTaker {

    Stack<EmployeeMemento> stack = new Stack<>();

    public void save(Employee employee) {
        stack.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(stack.pop());
    }
}
