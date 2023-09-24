//Antonio Rubén Martínez Villegas
//Factoria
//Práctica 10
//14/09/2023
import java.util.Scanner;
public class _p60SumaTerminos {
    public static void main(String[] args) {

        int i,j;
        float f, r;
        char res;

        Scanner DatoIng = new Scanner(System.in);

        do {

            r=0;

            //Obtencion de datos.
            System.out.print("Cuantos números ? "); int canNum = DatoIng.nextInt();

            //Establecemos el proceso de calculo.
            for(i=1; i<=canNum; i++) {
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.printf(" 1 / %,.2f +",f);
                r += (1 / f);
            }

            //Mostramos resultados.
            System.out.printf("= %,.2f\n",r);

            System.out.print("\nDeseas continuar (S/N)? "); res=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( res != 'N');
        System.out.println("\n Tremendisimo capo sos, crack");
        DatoIng.close();
    }
}