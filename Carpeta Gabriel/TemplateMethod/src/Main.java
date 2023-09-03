public class Main {
    public static void main(String[] args) {
        System.out.println("Preparando té:");
        BebidaCaliente miTe = new Te();
        miTe.prepararBebida();

        System.out.println("\nPreparando café:");
        BebidaCaliente miCafe = new Cafe();
        miCafe.prepararBebida();
    }
}