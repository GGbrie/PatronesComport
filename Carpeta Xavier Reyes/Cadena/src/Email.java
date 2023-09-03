// Email.java
public class Email {
    private boolean isSpam;
    private boolean isImportant;

    public Email(boolean isSpam, boolean isImportant) {
        this.isSpam = isSpam;
        this.isImportant = isImportant;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public boolean isImportant() {
        return isImportant;
    }
}
