package designpattern.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setAge("12");
        employee.setName("Pranjal");
        CareTaker ct = new CareTaker();
        ct.save(employee);
        employee.setAge("122");
        ct.revert(employee);
        System.out.println(employee.getAge());
    }
}
