public class Aburrido implements Estado{
    private Mascota mascota;
    @Override
    public void setMascota (Mascota mascota) {
        this.mascota=mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer");
    }

    @Override
    public void jugar() {
        System.out.println("Juguemos!");
        mascota.setEstado(new Cansado());
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir");
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy aburrido, quiero jugar");
    }
}
