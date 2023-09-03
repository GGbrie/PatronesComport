import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements Estado {
    private Mascota mascota;
    public Durmiendo(){
    }

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
        Timer timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.mascota.setEstado(new Hambriento());
            }
        },5000);

    }

    @Override
    public void alimentar() {
        System.out.println("...");
    }

    @Override
    public void jugar() {
        System.out.println("...");
    }

    @Override
    public void dormir() {
        System.out.println("...");
        mascota.setEstado(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("...");
    }
}
