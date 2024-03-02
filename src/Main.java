import java.util.Scanner;

public class Main {
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

// Este comentario lo eliminaré con mi siguiente commit.