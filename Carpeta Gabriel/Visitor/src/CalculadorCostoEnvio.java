public class CalculadorCostoEnvio implements VisitanteCostoEnvio {
    @Override
    public double visitar(Libro libro) {
        // Calcula el costo de envío para un libro basado en su peso
        return libro.getPeso() * 2; // Costo es $ por kilogramo
    }
    @Override
    public double visitar(Ropa ropa) {
        // Calcula el costo de envío para ropa basado en su tamaño
        return ropa.getTamaño() * 5; // Costo es $ por metro cúbico
    }
}