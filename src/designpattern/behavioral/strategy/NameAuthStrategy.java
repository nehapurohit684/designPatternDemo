package designpattern.behavioral.strategy;

public class NameAuthStrategy implements AuthorizationStrategy {
    @Override
    public boolean executeStrategy(User user) {
    if(user.name.startsWith("A")) return true;
    return false;
    }
}
