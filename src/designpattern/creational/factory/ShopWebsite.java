package designpattern.creational.factory;

public class ShopWebsite extends Website {

    @Override
    protected void createWebsite() {
        pageList.add(new ShopPage());
    }
}
