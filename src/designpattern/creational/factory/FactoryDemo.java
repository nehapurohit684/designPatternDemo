package designpattern.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        Website site  = factory.getWebSite(WebsiteType.BLOG);
        System.out.println(site.getPageList());
        Website site2  = factory.getWebSite(WebsiteType.SHOP);
        System.out.println(site2.getPageList());
    }
}
