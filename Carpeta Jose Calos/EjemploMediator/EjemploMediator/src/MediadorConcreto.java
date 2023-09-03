// Esta es una clase concreta llamada "MediadorConcreto" que implementa la interfaz "Mediador".
public class MediadorConcreto implements Mediador {
    // Estas son referencias a los colegas que este mediador va a controlar.
    private ColegaA colegaA;
    private ColegaB colegaB;
    // Constructor por defecto.
    public MediadorConcreto() {
    }
    // Estos métodos permiten establecer las referencias a los colegas dentro del mediador.
    public void setColegaA(ColegaA colegaA) {
        this.colegaA = colegaA;
    }

    public void setColegaB(ColegaB colegaB) {
        this.colegaB = colegaB;
    }
    // Implementación del método "enviarMensaje" definido en la interfaz "Mediador".
    // Este método se encarga de transmitir mensajes entre los colegas.
    public void enviarMensaje(String mensaje, Colega colega) {
        // Si el colega que envía el mensaje es "colegaA", el mensaje se envía a "colegaB".
        if (colega == this.colegaA) {
            this.colegaB.recibirMensaje(mensaje);
            // Si el colega que envía el mensaje es "colegaB", el mensaje se envía a "colegaA".
        } else if (colega == this.colegaB) {
            this.colegaA.recibirMensaje(mensaje);
        }

    }
}