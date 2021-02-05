package designpattern.structural.facade;

import designpattern.creational.singleton.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DBSingleton dbSingleton = null;

    JdbcFacade(){
        dbSingleton = DBSingleton.getInstance();
    }

    public int createTable(String sql){
        int count =0;
        try {
            Connection connection = dbSingleton.getConnection();
            Statement stmt = connection.createStatement();
            count = stmt.executeUpdate(sql);
            stmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable(String sql){
        int count =0;
        try {
            Connection connection = dbSingleton.getConnection();
            Statement stmt = connection.createStatement();
            count = stmt.executeUpdate(sql);
            stmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return count;
    }

    public List<Record> getRecords(String sql){
        List<Record> records = new ArrayList<>();
        try {
            Connection connection = dbSingleton.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet set = stmt.executeQuery(sql);
            while (set.next()){
                Record record = new Record();
                record.setId(set.getString(1));
                record.setName(set.getString(2));
                records.add(record);
            }
            stmt.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return records;
    }
}
