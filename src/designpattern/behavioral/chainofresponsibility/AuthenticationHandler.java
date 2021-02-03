package designpattern.behavioral.chainofresponsibility;

public abstract class AuthenticationHandler {

    AuthenticationHandler successor;

    abstract boolean handleAuth(User u);

    public void setSuccessor(AuthenticationHandler successor) {
        this.successor = successor;
    }
}
