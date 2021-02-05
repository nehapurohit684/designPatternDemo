package designpattern.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("main","mainURL");
        mainMenu.addMenuItem(new MenutItem("subMenu","subURL"));
        mainMenu.addMenuItem(new Menu("anotherMainMenu","anotherURL"));
        System.out.println(mainMenu.toString());
    }

}
