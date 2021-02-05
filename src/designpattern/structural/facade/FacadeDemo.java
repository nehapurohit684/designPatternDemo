package designpattern.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {
        JdbcFacade facade = new JdbcFacade();
        facade.createTable("CREATE TABLE Persons (id int,name varchar(255))");
        facade.insertIntoTable("Insert into Persons values (1021,'neha')");
        facade.getRecords("select * from Persons");

    }
}
