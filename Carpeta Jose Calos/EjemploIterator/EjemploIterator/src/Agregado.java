// Esta es una interfaz llamada "Agregado" que define un contrato para objetos agregados.
public interface Agregado {
    // Este método se utiliza para obtener un iterador que puede recorrer los elementos en el agregado.
    Iterador getIterador();
    // Nota: Esta interfaz define un único método, "getIterador", que permite a los objetos agregados proporcionar
    // una manera de obtener un iterador para recorrer sus elementos. Las clases que implementen esta interfaz
    // proporcionarán las implementaciones concretas de este método.
}
