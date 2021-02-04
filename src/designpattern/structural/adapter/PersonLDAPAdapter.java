package designpattern.structural.adapter;

public class PersonLDAPAdapter implements Person {

    PersonLDAP personLDAP;

    public PersonLDAPAdapter(PersonLDAP personLDAP) {
       this.personLDAP =personLDAP;
    }

    @Override
    public String getId() {
        return personLDAP.getId();
    }

    @Override
    public String getName() {
        return personLDAP.getName();
    }
}
