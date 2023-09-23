//Antonio Rubén Martínez Villegas
//Suma de digitos
//Practica 5
//23/09/2023
import java.util.Scanner;
public class _p71SumaDigitos {
    public static int SumaDigitos(int n) {
        int suma=0, digito;
        while( n!= 0) {
            digito = n % 10;
            n = n / 10 ;
            suma+=digito;
        }
        return suma;
    }
    public static void main(String[] args) {
        int numero;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame un número ? "); numero = obj.nextInt();
        System.out.printf("\nLa suma de digitos es : %d",SumaDigitos(numero));
        obj.close();
    }
}