package designpattern.creational.factory;

public class BlogWebsite extends Website {
    @Override
    protected void createWebsite() {
        pageList.add(new BlogPage());
    }
}
