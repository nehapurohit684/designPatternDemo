package designpattern.structural.bridge;

import java.util.Map;

public class MoviePrinter extends Printer{

    Movie m;
    MoviePrinter(Movie m){
      this.m=m;
    }

    @Override
    protected Map<String, String> getDetails() {
        return m.getDetails();
    }

    @Override
    protected String getHeader() {
        return m.getHeader();
    }
}
