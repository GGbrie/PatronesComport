public class Ropa extends Producto {
    private double tamaño; // Tamaño en metros cúbicos

    public Ropa(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    @Override
    public double aceptar(VisitanteCostoEnvio visitante) {
        return visitante.visitar(this);
    }
}