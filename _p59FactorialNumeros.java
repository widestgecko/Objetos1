//Antonio Rubén Martínez Villegas
//Factoria
//Práctica 10
//14/09/2023
import java.util.Scanner;
    public class _p59FactorialNumeros {
    public static void main(String[] args) {

        int i,j,f;
        char resp;

        Scanner DatoIng = new Scanner(System.in);

        do {

            System.out.print("Ingrese la cantidad de numeros a calcular su factorial: "); int canNum = DatoIng.nextInt();

            //Establecemos el proceso a seguir.
            for(i=1; i<=canNum; i++) {
                System.out.printf("%d!=",i);
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.println(f);
            }

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(DatoIng.next().charAt(0));
        } while( resp!= 'N');
        System.out.println("\nProceso terminado ..");
        DatoIng.close();
    }
}