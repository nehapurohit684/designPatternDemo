package designpattern.behavioral.strategy;

public class AdminAuthStrategy implements AuthorizationStrategy{

    @Override
    public boolean executeStrategy(User user) {
        if(user.getRole().equalsIgnoreCase("admin")) return true;
        return false;
    }
}
