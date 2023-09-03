// ImportantHandler.java
public class ImportantHandler implements EmailHandler {
    private EmailHandler nextHandler;

    public void setNextHandler(EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleEmail(Email email) {
        if (email.isImportant()) {
            System.out.println("Este correo es importante.");
        } else if (nextHandler != null) {
            nextHandler.handleEmail(email);
        }
    }
}