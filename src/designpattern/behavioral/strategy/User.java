package designpattern.behavioral.strategy;

public class User {

    String role;
    String name;

    AuthorizationStrategy strategy;

    User(AuthorizationStrategy strategy){
        this.strategy =strategy;
    }

    public boolean isValid(){
        return strategy.executeStrategy(this);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
