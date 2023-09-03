// Esta es una clase llamada "ColegaA" que implementa la interfaz "Colega".
public class ColegaA implements Colega {
    // Esta es una referencia al mediador que se utilizará para comunicarse con otros colegas.
    private Mediador mediador;
    // Constructor que recibe una referencia al mediador como parámetro.
    public ColegaA(Mediador mediador) {
        this.mediador = mediador;
    }
    // Implementación del método "enviar" definido en la interfaz "Colega".
    // Este método se utiliza para enviar un mensaje a través del mediador.
    public void enviar(String mensaje) {
        // Llama al método "enviarMensaje" del mediador y pasa el mensaje y una referencia a sí mismo (this).
        this.mediador.enviarMensaje(mensaje, this);
    }
    // Implementación del método "recibirMensaje" definido en la interfaz "Colega".
    // Este método se llama cuando el colega recibe un mensaje.
    public void recibirMensaje(String mensaje) {
        // Imprime en la consola el mensaje recibido.
        System.out.println("Colega A recibe el mensaje: " + mensaje);
    }
}
