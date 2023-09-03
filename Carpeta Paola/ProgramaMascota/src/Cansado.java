public class Cansado implements Estado {
    private Mascota mascota;
    public Cansado(){
    }

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer");
    }

    @Override
    public void jugar() {
        System.out.println("No quiero jugar, estoy cansado");
    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches");
        mascota.setEstado(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueño, quiero dormir");
    }
}
