package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String URL;

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    List<MenuComponent> menuComponentList = new ArrayList<>();

    public String print(MenuComponent menuComponent){
        StringBuilder builder = new StringBuilder();
        builder.append(menuComponent.getName() +" : ");
        builder.append(menuComponent.getURL()+"\n");
        return builder.toString();
    }

    public abstract String toString();
}
