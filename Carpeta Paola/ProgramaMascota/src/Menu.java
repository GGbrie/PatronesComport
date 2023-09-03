import java.util.Scanner;

public class Menu {
        Mascota mascota;
        public Menu (Mascota mascota) {
            this.mascota=mascota;
        }
        public void display(){
            Scanner scanner= new Scanner(System.in);
            char opcion;
            String mensajeOpciones= "Realizar accion:"+
                    "a) alimentar. b) dormir, c) jugar, d) preguntar, e) salir";
            while (true){
                System.out.println(mensajeOpciones);
                opcion = scanner.next().charAt(0);
                switch (opcion) {
                    case 'a': System.out.println("Mascota: "); mascota.alimentar(); break;
                    case 'b': System.out.println("Mascota: "); mascota.dormir(); break;
                    case 'c': System.out.println("Mascota: "); mascota.jugar(); break;
                    case 'd': System.out.println("Mascota: "); mascota.comoEstas(); break;
                    case 'e': System.out.println("Hasta pronto"); System.exit(0);
                    default: System.out.println("Opcion no valida");

                }
            }
        }
}
