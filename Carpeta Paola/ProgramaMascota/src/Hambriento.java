public class Hambriento implements Estado {
    private Mascota mascota;
    public Hambriento(){
    }

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("ñami!");
        mascota.setEstado(new Aburrido());
    }

    @Override
    public void jugar() {
        System.out.println("No quier jugar, tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño");
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo hambre, quiero comer");
    }
}
