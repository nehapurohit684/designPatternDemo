package designpattern.structural.adapter;

public class PersonLDAP {

    int id;
    String firstName;

    PersonLDAP(int id,String firstName){
        this.id=id;
        this.firstName=firstName;
    }

    public String getId() {
        return String.valueOf(this.id);
    }
    public String getName() {
        return this.firstName;
    }

}
