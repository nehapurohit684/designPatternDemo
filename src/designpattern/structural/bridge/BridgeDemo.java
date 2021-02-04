package designpattern.structural.bridge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BridgeDemo {

    public static void main(String[] args) {
        Map<String,String> details = new HashMap<>();
        details.put("title1","Dil Chahta hai");
        details.put("title2","Dil hai tumhara");
        Movie movie = new Movie("MHeader",details);

        Map<String,String> detail = new HashMap<>();
        detail.put("title1","Text1");
        detail.put("title2","Text2");
        Text text = new Text("MHeader",details);

        Formatter movieFormatter = new PrintFormatter();
        MoviePrinter moviePrinter= new MoviePrinter(movie);
        System.out.println(moviePrinter.print(movieFormatter));

        Formatter textFormatter = new HTMLFormatter();
        TextPrinter textPrinter= new TextPrinter(text);
        System.out.println(textPrinter.print(textFormatter));
    }
}
