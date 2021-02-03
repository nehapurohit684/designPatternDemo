package designpattern.behavioral.chainofresponsibility;

public class UserExistAuthentication extends AuthenticationHandler {
    @Override
    public boolean handleAuth(User u) {
        if(u.userExist) return successor.handleAuth(u);
        else return false;
    }
}
