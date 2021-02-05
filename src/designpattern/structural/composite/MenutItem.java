package designpattern.structural.composite;

import java.awt.*;

public class MenutItem extends MenuComponent{

    MenutItem(String name,String URL){
        this.name =name;
        this.URL =URL;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
