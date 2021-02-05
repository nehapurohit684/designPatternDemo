package designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    private Map<String,Item> map = new HashMap<>();

    public Item lookup(String itemName){
        if(!map.containsKey(itemName))
          map.put(itemName, new Item());
        return map.get(itemName);
    }

    public int totalItems(){
        return map.size();
    }
}
