public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto libro = new Libro(1.5); // Libro de 1.5 kg
        Producto ropa = new Ropa(0.5); // Ropa de 0.5 m³

        // Crear un visitante para calcular el costo de envío
        VisitanteCostoEnvio calculador = new CalculadorCostoEnvio();

        // Calcular el costo de envío para los productos
        double costoEnvioLibro = libro.aceptar(calculador);
        double costoEnvioRopa = ropa.aceptar(calculador);

        // Mostrar los resultados
        System.out.println("Costo de envío para el libro: $" + costoEnvioLibro);
        System.out.println("Costo de envío para la ropa: $" + costoEnvioRopa);
    }
}