package designpattern.structural.adapter;

public class PersonDB implements Person{

    public String id;
    public String name;

    PersonDB(String id, String name){
        this.id= id;
        this.name=name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
