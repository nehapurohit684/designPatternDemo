package designpattern.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSingleton {

    private static volatile DBSingleton dbInstance = null;
    private static volatile Connection conn =null;

    private DBSingleton(){
        if(dbInstance !=null)
            throw new RuntimeException("Use get Instance");

        //initialize DriverManager.register(Driver)
    }

    //Lazy loading
    public static DBSingleton getInstance(){
        if(dbInstance==null){
            synchronized (DBSingleton.class){
                if(dbInstance==null) dbInstance = new DBSingleton();
            }
        }
        return dbInstance;
    }
    //note you dont have to make this static
    public Connection getConnection(){
        if(conn==null){
            synchronized (DBSingleton.class){
                if(conn==null) {
                    try {
                        conn = DriverManager.getConnection("dburl");
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
