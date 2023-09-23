//Antonio Rubén Martínez Villegas
//Longitudes
//Practica 5
//21/09/2023
import java.util.Scanner;

public class _p77MedidasLongitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println(" Para Convertir pulgadas a centímetros, presiona 1");
            System.out.println(" Para Convertir metros a pies, presiona 2");
            System.out.println(" Para Salir Del programa, presiona 3");
            
            System.out.print("Ingrese una opción: ");
            
            int opcion = scanner.nextInt();
            
            System.out.print("\033[H\033[2J");System.out.flush();
            
            if (opcion == 1) {
                System.out.print("Ingrese la longitud en pulgadas: ");
                double pulgadas = scanner.nextDouble();
                double centimetros = pulgadas * 2.54;
                System.out.println(pulgadas + " pulgadas son " + centimetros + " centímetros.");
            
            } else if (opcion == 2) {
                System.out.print("Ingrese la longitud en metros: ");
                double metros = scanner.nextDouble();
                double pies = metros * 3.281;
                System.out.println(metros + " metros son " + pies + " pies.");
            
            } else if (opcion == 3) {
                break;
            
            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }
        
        
        scanner.close();
    }
}