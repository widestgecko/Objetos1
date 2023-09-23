//Antonio Rubén Martínez Villegas
//Suma de multiplos
//Practica 5
//21/09/2023
import java.util.Scanner;

public class _p78SumaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Para Sumar múltiplos de 3, presiona 1");
            System.out.println("Para Sumar múltiplos de 4, presiona 2");
            System.out.println("Para Salir, presiona 3");

            int opcion = scanner.nextInt();
            

            
            if (opcion == 1) {
                int ini = scanner.nextInt();
                int fin = scanner.nextInt();
                int suma = 0;
                
                if (ini < fin) {
                    for (int i = ini; i <= fin; i++) {
                        if (i % 3 == 0) {
                            suma += i;
                        }
                    }
                    
                    System.out.println("La suma de los múltiplos de 3 entre " + ini + " y " + fin + " es: " + suma);
                } else {
                    System.out.println("El rango de números no es válido.");
                }
            } else if (opcion == 2) {
                int ini = scanner.nextInt();
                int fin = scanner.nextInt();
                int suma = 0;
                
                if (ini < fin) {
                    for (int i = ini; i <= fin; i++) {
                        if (i % 4 == 0) {
                            suma += i;
                        }
                    }
                    
                    System.out.println("La suma de los múltiplos de 4 entre " + ini + " y " + fin + " es: " + suma);
                } else {
                    System.out.println("El rango de números no es válido.");
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opción inválida, Inténtalo de nuevo.");
            }
        }
        
        scanner.close();
    }
}