package designpattern.structural.bridge;

import java.util.Map;

public interface Formatter {

    String format(String header, Map<String,String> details);
}
