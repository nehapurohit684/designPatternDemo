package designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class PersonClient {

    public static List<Person> getEmployeeList(){
        List<Person> employeeList = new ArrayList<>();

        Person employeeDB = new PersonDB("75","Neha");
        employeeList.add(employeeDB);

        Person employeeLDAP = new PersonLDAPAdapter(new PersonLDAP(76,"Amit"));
        employeeList.add(employeeLDAP);

        return employeeList;
    }
}
