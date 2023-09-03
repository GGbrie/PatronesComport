public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // Creamos un objeto MediadorConcreto
        MediadorConcreto mediador = new MediadorConcreto();
        // Creamos dos colegas, ColegaA y ColegaB, y les pasamos el mediador como parámetro
        ColegaA colegaA = new ColegaA(mediador);
        ColegaB colegaB = new ColegaB(mediador);
        // Establecemos la referencia del mediador en cada colega
        mediador.setColegaA(colegaA);
        mediador.setColegaB(colegaB);
        // Los colegas envían mensajes entre sí a través del mediador
        colegaA.enviar("Hola, colega B.");
        colegaB.enviar("Hola, colega A.");
    }
}
