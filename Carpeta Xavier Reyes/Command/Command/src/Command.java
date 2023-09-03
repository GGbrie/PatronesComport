// Interfaz Command
interface Command {
    void ejecutar();
}

// Clases ConcreteCommand
class SubirVolumenCommand implements Command {
    private Televisor televisor;

    public SubirVolumenCommand(Televisor televisor) {
        this.televisor = televisor;
    }

    public void ejecutar() {
        televisor.subirVolumen();
    }
}

class BajarVolumenCommand implements Command {
    private Televisor televisor;

    public BajarVolumenCommand(Televisor televisor) {
        this.televisor = televisor;
    }

    public void ejecutar() {
        televisor.bajarVolumen();
    }
}

// Clase Receiver
class Televisor {
    private int volumen = 50;

    public void subirVolumen() {
        volumen += 15;
        System.out.println("Volumen subido a " + volumen);
    }

    public void bajarVolumen() {
        volumen -= 25;
        System.out.println("Volumen bajado a " + volumen);
    }
}

// Clase Invoker
class ControlRemoto {
    private Command botonA;
    private Command botonB;

    public ControlRemoto(Command botonA, Command botonB) {
        this.botonA = botonA;
        this.botonB = botonB;
    }

    public void presionarBotonA() {
        botonA.ejecutar();
    }

    public void presionarBotonB() {
        botonB.ejecutar();
    }
}

