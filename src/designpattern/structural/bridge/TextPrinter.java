package designpattern.structural.bridge;

import java.util.List;
import java.util.Map;

public class TextPrinter extends Printer{

    Text text;

    TextPrinter(Text text){
        this.text=text;
    }

    @Override
    protected Map<String, String> getDetails() {
        return text.getDetails();
    }

    @Override
    protected String getHeader() {
        return text.getHeader();
    }
}
