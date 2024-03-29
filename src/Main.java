// Main.java

import java.util.Scanner;

/**
 * Clase principal que solicita la edad al usuario y muestra los aniços restantes hasta la jubilacion.
 */
public class Main {
	/**
	 * Metodo principal que solicita la edad al usuario, calcula los anios hasta la jubilacion y muestra un mensaje.
	 * @param args Argumentos de linea de comandos (no se utilizan en este programa).
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su edad en anios:");
		int edad = scanner.nextInt();
		scanner.close();

		Persona persona = new Persona(edad);
		int aniosParaJubilarse = persona.calcularAniosHastaJubilacion();

		if (aniosParaJubilarse < 10) {
			System.out.println("Solo te quedan " + aniosParaJubilarse + " anios. ¡Vamos que ya queda poco!");
		} else if (aniosParaJubilarse > 20) {
        	System.out.println("Te quedan " + aniosParaJubilarse + " anios. ¡A seguir trabajando gandul!");
		} else {
            System.out.println("Te quedan " + aniosParaJubilarse + " anios para jubilarte.");
		}
	}
}