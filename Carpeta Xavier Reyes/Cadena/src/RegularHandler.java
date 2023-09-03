// RegularHandler.java
public class RegularHandler implements EmailHandler {
    public void handleEmail(Email email) {
        System.out.println("Este correo es regular.");
    }

    public void setNextHandler(EmailHandler nextHandler) {
        // El manejador regular es el último en la cadena, no necesita un siguiente manejador.
    }
}