package designpattern.behavioral.chainofresponsibility;

public class CORDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Neha");
        user.setType("admin");
        user.setUserExist(true);
        AuthenticationHandler handler = new UserExistAuthentication();
        handler.setSuccessor(new RoleCheckAuthentication());
        handler.handleAuth(user);
        System.out.println(handler.handleAuth(user));
    }


}
