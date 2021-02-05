package designpattern.structural.composite;

import designpattern.creational.prototype.Item;

import java.util.Iterator;

public class Menu extends MenuComponent {

    Menu(String name,String URL){
            this.name =name;
            this.URL =URL;
     }

    public MenuComponent addMenuItem(MenuComponent menuComponent){
        menuComponentList.add(menuComponent);
        return menuComponent;
    }
    public MenuComponent removeMenuItem(MenuComponent menuComponent){
        menuComponentList.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        Iterator<MenuComponent> iterator = menuComponentList.iterator();
       while (iterator.hasNext()){
           MenuComponent menuComponent = iterator.next();
           builder.append(menuComponent.toString());
       }
       return builder.toString();
    }
}
