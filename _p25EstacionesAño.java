//Antonio Rubén Martínez Villegas
//Estaciones del año
//Actividad 5
//31/08/2023
import java.util.Scanner;  
public class _p25EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        //El usuario eligirá la estación del año 
    System.out.println("Muestra la estacion del año en base al número:\n");
    System.out.print("Dame un numero (1..4) ? ");
    int n = new Scanner(System.in).nextInt();
    //Se determina la estación en base a la respuesta
    if(n==1) System.out.println("Primavera");
    if(n==2) System.out.println("Verano");
    if(n==3) System.out.println("Otoño");
    if(n==4) System.out.println("Invierno");
    System.out.println("\nProceso terminado ....");
    }
}
