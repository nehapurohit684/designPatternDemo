package designpattern.behavioral.strategy;

public interface AuthorizationStrategy {

    public abstract boolean executeStrategy(User user);

}
