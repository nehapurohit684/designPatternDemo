package designpattern.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        DBSingleton dbSingleton = DBSingleton.getInstance();
        System.out.println(dbSingleton);

        DBSingleton dbSingleton1 = DBSingleton.getInstance();
        System.out.println(dbSingleton1);
    }
}
