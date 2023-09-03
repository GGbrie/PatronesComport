// Esta es una interfaz llamada "Iterador" que define un contrato para objetos iteradores.
public interface Iterador {
    // Este método se utiliza para obtener el primer elemento en la secuencia a ser iterada.
    Object primero();
    // Este método se utiliza para avanzar al siguiente elemento en la secuencia.
    Object siguiente();
    // Este método verifica si todavía hay elementos en la secuencia para ser iterados.
    boolean hayMas();
    // Este método se utiliza para obtener el elemento actual en la secuencia.
    Object actual();
    // Nota: Esta interfaz define los métodos necesarios para que los iteradores puedan recorrer una secuencia de elementos.
    // Las clases que implementen esta interfaz proporcionarán las implementaciones concretas de estos métodos.
}
