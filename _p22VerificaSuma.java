//Antonio Rubén Martínez Villegas
//Sumas
//Actividad 4
//30/08/2023

import java.util.Scanner;
public class _p22VerificaSuma {
    public static void main(String[] args) {
    
    //Declaración de ariables
    int Digi1, Digi2, Compara;
    Scanner obj = new Scanner(System.in);
    System.out.print("\033[H\033[2J"); System.out.flush();
    //Suma inicial
    System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
    System.out.print("Dame el primer numero ? "); Digi1 = obj.nextInt();
    System.out.print("Dame el seguno numero ? "); Digi2 = obj.nextInt();
    //Comparación con el resultado de la suma
    System.out.print("Dame el tercer numero ? "); Compara = obj.nextInt();
    if( Digi1+Digi2 == Compara )
            System.out.println("\nSon iguales");
    else
            System.out.println("\nSon distintos");
            System.out.println("\nGracias por utilizar este programa");
    }
}