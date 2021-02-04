package designpattern.structural.bridge;

import java.util.List;
import java.util.Map;

public class Movie extends Printable{

    Movie(String header, Map<String, String> details){
        this.header =header;
        this.details=details;
    }
}
