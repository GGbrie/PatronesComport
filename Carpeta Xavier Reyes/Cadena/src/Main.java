// Main.java
public class Main {
    public static void main(String[] args) {
        EmailHandler spamHandler = new SpamHandler();
        EmailHandler importantHandler = new ImportantHandler();
        EmailHandler regularHandler = new RegularHandler();

        spamHandler.setNextHandler(importantHandler);
        importantHandler.setNextHandler(regularHandler);


        Email email1 = new Email(true, false);//spam t y f
        Email email2 = new Email(false, true);//important f y t
        Email email3 = new Email(false, false);//regular f y f

        spamHandler.handleEmail(email1);
        spamHandler.handleEmail(email2);
        spamHandler.handleEmail(email3);
    }
}
