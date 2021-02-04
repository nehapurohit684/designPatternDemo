package designpattern.structural.bridge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text extends Printable{

    Text(String header,Map<String, String> details){
        this.header =header;
        this.details=details;
    }
}
