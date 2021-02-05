package designpattern.structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();
        system.takeOrder(1,"shampoo");
        system.takeOrder(2,"shampoo");
        system.takeOrder(3,"banana");
        system.takeOrder(4,"milk");
        system.takeOrder(5,"shampoo");

        system.processOrder();

        System.out.println(system.genaretReport());



    }
}
