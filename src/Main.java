// Main.java

import java.util.Scanner;

/**
 * Clase principal que solicita la edad al usuario y muestra los años restantes hasta la jubilación.
 */
public class Main {
    /**
     * Método principal que solicita la edad al usuario, calcula los años hasta la jubilación y muestra un mensaje.
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad en años:");
        int edad = scanner.nextInt();
        scanner.close();
        
        Persona persona = new Persona(edad);
        int añosParaJubilarse = persona.calcularAñosHastaJubilacion();
        
        if (añosParaJubilarse < 10) {
            System.out.println("Sólo te quedan " + añosParaJubilarse + " años. ¡Vamos que ya queda poco!");
        } else if (añosParaJubilarse > 20) {
            System.out.println("Te quedan " + añosParaJubilarse + " años. ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + añosParaJubilarse + " años para jubilarte.");
        }
    }
}