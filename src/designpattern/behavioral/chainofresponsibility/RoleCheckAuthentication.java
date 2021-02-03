package designpattern.behavioral.chainofresponsibility;

public class RoleCheckAuthentication extends AuthenticationHandler {
    @Override
    public boolean handleAuth(User u) {
        if(u.type.equalsIgnoreCase("admin"))
            return true;
        else
            return false;
    }
}
