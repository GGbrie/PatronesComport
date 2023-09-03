// Importamos la clase Vector del paquete java.util.
import java.util.Vector;
// Esta es una clase llamada "AgregadoConcreto" que implementa la interfaz "Agregado".
public class AgregadoConcreto implements Agregado {
    // Vector que almacena los datos que se van a recorrer con un iterador.
    protected Vector<String> aDatos = new Vector();
    // Constructor de la clase.
    public AgregadoConcreto() {
        // Llama al método "llenar" para agregar elementos al vector cuando se crea una instancia de la clase.
        this.llenar();
    }
    // Implementación del método "getIterador" definido en la interfaz "Agregado".
    // Este método se utiliza para obtener un iterador que puede recorrer los elementos en el agregado.
    public Iterador getIterador() {
        return new IteradorConcreto(this);
    }
    // Método "llenar" que se utiliza para agregar elementos al vector.
    public void llenar() {
        this.aDatos.add("JOSE");
        this.aDatos.add("MARTA");
        this.aDatos.add("ANTONIO");
        this.aDatos.add("ROMINA");
    }
}
