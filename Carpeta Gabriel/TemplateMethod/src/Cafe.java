class Cafe extends BebidaCaliente {
    @Override
    void prepararIngredientes() {
        System.out.println("Moliendo granos de café");
    }
    @Override
    void agregarCondimentos() {
        System.out.println("Agregando azúcar y leche");
    }
}