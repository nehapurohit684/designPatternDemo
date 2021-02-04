package designpattern.structural.bridge;

import java.util.Map;

public class HTMLFormatter implements Formatter{

    @Override
    public String format(String header, Map<String, String> details) {
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("<header>"+header+"</header>\n<body>\n");

        for (String s: details.keySet()) {
            stringBuilder.append(s+ " : " +details.get(s)+ "\n");
        }
        stringBuilder.append("</body>");

        return stringBuilder.toString();
    }
}
