package designpattern.structural.bridge;

import java.util.List;
import java.util.Map;

public abstract class Printer {


    public String print(Formatter f){
        return f.format(getHeader(),getDetails());
    }

    protected abstract Map<String,String> getDetails();

    protected abstract String getHeader();
}
