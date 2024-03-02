// Persona.java

/**
 * Clase que representa una persona con su edad actual.
 */
public class Persona {
    private int edadActual;

    /**
     * Constructor de la clase Persona.
     * @param edadActual La edad actual de la persona.
     */
    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    /**
     * Método para calcular los años restantes hasta la jubilación.
     * @return Los años restantes hasta la jubilación.
     */
    public int calcularAñosHastaJubilacion() {
        int añosRestantes = 67 - edadActual;
        return añosRestantes;
    }
}
