//Antonio Rubén Martínez Villegas
//Impares
//Actividad 8
//19/09/2023
import java.util.Scanner;
public class _p45ImparesDescendente {
    public static void main(String[] args) {
        //Declaramos variables.
        int nicial,conta,suma;
        char resp;

        //Creamos una entrada de datos.
        Scanner DatoUsua = new Scanner(System.in);

        do {
            //Limpiamos la pantalla de la consola.
            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Este programa imprime los numeros impares de forma descendiente hasta el numero uno.");
            DatoUsua.nextLine();
            System.out.print("¿Desde que numero? "); nicial = DatoUsua.nextInt();

            //Establecemos el numero inicial.
            suma = 0; conta = ( nicial%2 == 0 ? --nicial : nicial);
            while( conta>=1 ) {
                //Imprimimos los numeros.
                System.out.printf("%d ",conta);
                suma += conta;
                conta -= 2;
            }

            //Mostramos los resultados.
            System.out.printf("\nLa suma es %d",suma);

            //Plantemos la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(DatoUsua.next().charAt(0));
        } while( resp != 'N' );
    System.out.println("\nGracias por utilizar este programa !");
    DatoUsua.close();
    }
}