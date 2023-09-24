//Antonio Rubén Martínez Villegas
//Tablas
//Práctica 10
//14/09/2023
import java.util.Scanner;
public class _p57TablasMultiplicar {
    public static void main(String[] args) {
        //variables.
        int i, j;
        char resp;

        //Etrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();

            System.out.print("Hasta que tabla ? "); int n = DatoIng.nextInt();
            System.out.print("Hasta donde ? "); int m = DatoIng.nextInt();

            //Imprimimos
            for(i=1; i<=n; i++) {
                System.out.printf("Tabla del %d\n",i);
                for(j=1; j<=m; j++) {
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
            }

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ?");resp=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nEso es todo, mi estimado");
        DatoIng.close();
    }
}