// Cliente
public class EjemploCommand {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Command subirCommand = new SubirVolumenCommand(televisor);
        Command bajarCommand = new BajarVolumenCommand(televisor);

        ControlRemoto control = new ControlRemoto(subirCommand, bajarCommand);

        control.presionarBotonA();  // Sube el volumen
        control.presionarBotonB();  // Baja el volumen
    }
}
