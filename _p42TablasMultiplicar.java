//Antonio Rubén Martínez Villegas
//Tablas de multiplicar
//Actividad 7
//19/09/2023
import java.util.Scanner;
public class _p42TablasMultiplicar{
    public static void main(String[] args) {
        //Abrimos la entrada de datos
        Scanner DatoIng = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        //Se obtienen los datos.
       
        System.out.print("¿Que tabla deseas conocer?: "); int tab = DatoIng.nextInt();
        System.out.print("¿Hasta donde? "); int limite = DatoIng.nextInt();
        int num = 1;

        //Mostramos la tabla
        while( num <= limite ) {
            System.out.printf("%d x %d = %d\n", tab, num, tab*num); num++;
        }
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}