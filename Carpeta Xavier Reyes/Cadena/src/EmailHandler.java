// EmailHandler.java
public interface EmailHandler {
    void setNextHandler(EmailHandler nextHandler);
    void handleEmail(Email email);
}
