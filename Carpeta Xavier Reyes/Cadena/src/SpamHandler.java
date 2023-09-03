// SpamHandler.java
public class SpamHandler implements EmailHandler {
    private EmailHandler nextHandler;

    public void setNextHandler(EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleEmail(Email email) {
        if (email.isSpam()) {
            System.out.println("Este correo es spam.");
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}