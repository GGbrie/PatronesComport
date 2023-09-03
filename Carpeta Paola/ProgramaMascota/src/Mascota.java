public class Mascota {

    private Estado estado;

    public Mascota () {
        setEstado (new Aburrido ());

    }

    public void setEstado (Estado estado) {
        this.estado=estado;
        this.estado.setMascota (this);
        }
        public void alimentar() {
            this. estado.alimentar();
        }
        public void dormir(){
            this.estado.dormir();
        }
        public void jugar() {
            this.estado.jugar ();
        }
        public void comoEstas() {
                this.estado.comoEstas();
        }
    }