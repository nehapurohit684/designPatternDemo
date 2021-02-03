package designpattern.creational.factory;

public class WebSiteFactory {

    Website getWebSite(WebsiteType type){
        switch (type){
            case BLOG: return new BlogWebsite();
            case SHOP: return new ShopWebsite();
            default: return null;
        }
    }
}
