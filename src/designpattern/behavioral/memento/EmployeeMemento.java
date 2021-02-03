package designpattern.behavioral.memento;

public class EmployeeMemento {

    String name;
    String age;

    EmployeeMemento(String name,String age){
        this.name =name;
        this.age =age;
    }

    public String getAge() {
        return age;
    }
    public String getName() {
        return name;
    }


}
