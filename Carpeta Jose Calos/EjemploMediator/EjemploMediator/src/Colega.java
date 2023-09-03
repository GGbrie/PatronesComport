// Esta es una interfaz llamada "Colega" que define un contrato para objetos colegas.
public interface Colega {
    // Este método se utiliza para que un colega envíe un mensaje a otro colega.
    // El mensaje se pasa como parámetro.
    void enviar(String var1);
    // Este método se llama cuando un colega recibe un mensaje.
    // El mensaje recibido se pasa como parámetro.
    void recibirMensaje(String var1);
    // Nota: En esta interfaz, se definen los métodos necesarios para que los colegas puedan comunicarse
    // entre sí a través del mediador. Las clases que implementen esta interfaz proporcionarán las
    // implementaciones concretas de estos métodos.
}
