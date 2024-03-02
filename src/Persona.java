
public class Persona {
    private int edadActual;

    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    public int calcularAñosHastaJubilacion() {
        int añosRestantes = 67 - edadActual;
        return añosRestantes;
    }
}
