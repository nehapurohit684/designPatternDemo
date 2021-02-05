package designpattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {

    Catalog catalog =new Catalog();
    private List<Order> orders = new ArrayList<>();


    public void takeOrder(int orderNum,String itemName){
        Item item1 = catalog.lookup(itemName);
        Order order = new Order(orderNum,item1);
        orders.add(order);
    }
    public void processOrder(){
        for (Order order:orders) {
            order.processOrder();
        }
    }

    public String genaretReport(){
      return "Total Number of Object: " + catalog.totalItems();
    }

}
