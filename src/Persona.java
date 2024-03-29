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
	 * Metodo para calcular los anios restantes hasta la jubilacion.
	 * @return Los anios restantes hasta la jubilacion.
	 */
	public int calcularAniosHastaJubilacion() {
		int aniosRestantes = 67 - edadActual;
		return aniosRestantes;
	}
}