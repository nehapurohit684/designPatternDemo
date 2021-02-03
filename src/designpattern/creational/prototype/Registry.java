package designpattern.creational.prototype;

public class Registry {

    Item item;

    public Registry(){
        loadItems();
    }

    public Item createItem(){
        try {
            return (Item) item.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void loadItems() {
        this.item = new Item();
        item.setName("nameDefault");
    }
}
