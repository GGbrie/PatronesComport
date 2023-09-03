public class Main {
    public static void main(String[] args) {
        try {
            // Creamos una instancia de "AgregadoConcreto", que es una clase que implementa una colección de elementos.
            AgregadoConcreto agregado = new AgregadoConcreto();
            // Obtenemos un iterador para recorrer la colección.
            Iterador iterador = agregado.getIterador();
            // Accedemos al primer elemento de la colección utilizando el método "primero" del iterador.
            String obj = (String)iterador.primero();
            System.out.println(obj);
            // Avanzamos el iterador cuatro veces para acceder a elementos adicionales.
            iterador.siguiente();
            iterador.siguiente();
            iterador.siguiente();
            iterador.siguiente();
            // Accedemos al elemento actual del iterador utilizando el método "actual".
            System.out.println((String)iterador.actual() + "\n");
            // Reiniciamos el iterador al primer elemento de la colección.
            iterador.primero();
            // Iteramos a través de la colección utilizando un bucle while y el método "siguiente" del iterador.
            while(iterador.hayMas()) {
                System.out.println(iterador.siguiente());
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }
}
