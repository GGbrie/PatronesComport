public class Equipo {

    private EstrategiaJuego estrategiaJuego;

    public Equipo() {
        this.estrategiaJuego = new EstrategiaEspera();
    }

    public void setEstrategiaJuego(EstrategiaJuego estrategiaJuego) {
        this.estrategiaJuego = estrategiaJuego;
    }

    public void jugar(int numeroDeJugadores) {
        this.estrategiaJuego.jugar(numeroDeJugadores);
    }
}
