// Esta es una interfaz llamada "Mediador" que define un contrato para objetos mediadores.
public interface Mediador {
    // Este método permite enviar un mensaje desde un colega (var2) a otro colega o destinatario.
    // El mensaje (var1) y el destinatario (var2) se pasan como parámetros.
    void enviarMensaje(String var1, Colega var2);
}
