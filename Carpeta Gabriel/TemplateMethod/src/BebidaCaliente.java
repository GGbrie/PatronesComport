abstract class BebidaCaliente {
    public final void prepararBebida() {
        hervirAgua();
        prepararIngredientes();
        verterEnTaza();
        agregarCondimentos();
    }
    // Métodos abstractos que deben ser implementados por las subclases
    abstract void prepararIngredientes();
    abstract void agregarCondimentos();

    // Métodos concretos comunes
    void hervirAgua() {
        System.out.println("Hirviendo agua");
    }
    void verterEnTaza() {
        System.out.println("Vertiendo en la taza");
    }
}