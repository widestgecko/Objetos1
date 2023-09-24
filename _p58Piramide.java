//Antonio Rubén Martínez Villegas
//Piramide
//Práctica 10
//14/09/2023
import java.util.Scanner;
public class _p58Piramide {
    public static void main(String[] args) {

        int i,j;
        char res;

        Scanner DatoIng = new Scanner(System.in);

        do {


            System.out.print("  Cuál es el tamaño de la piramide: "); int TamIng = DatoIng.nextInt();
            System.out.print("¿Que caracter va a componer la piramide? "); char car = DatoIng.next().charAt(0);

            for(i=1; i<=TamIng; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print(car);
                }
                System.out.println();
            }

            //Damos al usuario la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ?"); res=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( res!= 'N');
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}