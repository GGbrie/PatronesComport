// Esta es una clase llamada "IteradorConcreto" que implementa la interfaz "Iterador".
public class IteradorConcreto implements Iterador {
    // Referencia al objeto "AgregadoConcreto" que se va a recorrer con este iterador.
    private AgregadoConcreto agregado;
    // Variable que mantiene un registro de la posición actual del iterador.
    private int posicion_actual = 0;
    // Constructor que recibe una referencia al objeto "AgregadoConcreto".
    public IteradorConcreto(AgregadoConcreto agregado) {
        this.agregado = agregado;
    }
    // Implementación del método "primero" definido en la interfaz "Iterador".
    // Este método se utiliza para obtener el primer elemento del agregado.
    public Object primero() {
        Object obj = null;
        if (!this.agregado.aDatos.isEmpty()) {
            this.posicion_actual = 0;
            obj = this.agregado.aDatos.firstElement();
        }

        return obj;
    }
    // Implementación del método "siguiente" definido en la interfaz "Iterador".
    // Este método se utiliza para avanzar al siguiente elemento del agregado.
    public Object siguiente() {
        Object obj = null;
        if (this.posicion_actual < this.agregado.aDatos.size()) {
            obj = this.agregado.aDatos.elementAt(this.posicion_actual);
            ++this.posicion_actual;
        }

        return obj;
    }
    // Implementación del método "hayMas" definido en la interfaz "Iterador".
    // Este método verifica si hay más elementos en el agregado para recorrer.
    public boolean hayMas() {
        boolean ok = false;
        if (this.posicion_actual < this.agregado.aDatos.size()) {
            ok = true;
        }

        return ok;
    }
    // Implementación del método "actual" definido en la interfaz "Iterador".
    // Este método se utiliza para obtener el elemento actual del agregado.
    public Object actual() {
        Object obj = null;
        if (this.posicion_actual < this.agregado.aDatos.size()) {
            obj = this.agregado.aDatos.elementAt(this.posicion_actual);
        }

        return obj;
    }
}
