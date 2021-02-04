package designpattern.structural.bridge;

import java.util.Map;

public class PrintFormatter implements Formatter{
    @Override
    public String format(String header, Map<String, String> details) {
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(header+"\n");

        for (String s: details.keySet()) {
            stringBuilder.append(s+ " : " +details.get(s)+"\n");
        }

        return stringBuilder.toString();
    }
}
