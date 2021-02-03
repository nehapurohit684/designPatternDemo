package designpattern.behavioral.memento;

public class Employee {

    String name;
    String age;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeMemento save(){
       return new EmployeeMemento(name,age);
    }

    public void revert(EmployeeMemento employeeMemento){
        this.name = employeeMemento.getName();
        this.age = employeeMemento.getAge();
    }
}
