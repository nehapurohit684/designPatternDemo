package designpattern.behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        AuthorizationStrategy strategy = new AdminAuthStrategy();

        User admin = new User(strategy);
        admin.setRole("admin");
        System.out.println("User is valid :" + admin.isValid());

    }
}
