package designpattern.structural.adapter;

import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        List<Person> people =PersonClient.getEmployeeList();
        for (Person p :people) {
            System.out.println(p.getId()+ " : "+p.getName());
        }
    }
}
