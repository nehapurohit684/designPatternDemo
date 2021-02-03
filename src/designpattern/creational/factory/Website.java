package designpattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    List<Page> pageList = new ArrayList<>();
    
    Website(){
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getPageList() {
        return pageList;
    }

}
