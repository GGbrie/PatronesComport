public class AplicacionEstrategia {

    public static void main(String[] args) {

        Equipo equipo = new Equipo();
        equipo.jugar(0);

        // Tenemos el balón
        equipo.setEstrategiaJuego(new EstrategiaAtaque());
        equipo.jugar(5);

        // Sin balón
        equipo.setEstrategiaJuego(new EstrategiaDefensa());
        equipo.jugar(8);

        // Medio Ataque
        equipo.setEstrategiaJuego(new EstrategiaMedioAtaque());
        equipo.jugar(1);

        equipo.setEstrategiaJuego(
                new EstrategiaJuego() {
                    @Override
                    public void jugar(int numeroDeJugadores) {
                        System.out.println("Simular faltas");
                    }
                });
        equipo.jugar(0);
    }
}

