public class Libro extends Producto {
    private double peso; // Peso en kilogramos

    public Libro(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double aceptar(VisitanteCostoEnvio visitante) {
        return visitante.visitar(this);
    }
}