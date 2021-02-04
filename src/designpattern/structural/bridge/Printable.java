package designpattern.structural.bridge;

import java.util.List;
import java.util.Map;

public abstract class Printable {


    String header;
    Map<String, String> details;

    public String getHeader() {
        return this.header;
    }
    public Map<String, String> getDetails() {
        return this.details;
    }
}
