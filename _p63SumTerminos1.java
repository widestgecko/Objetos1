//Antonio Rubén Martínez Villegas
//Terminos
//Práctica 4
//19/09/2023
import java.util.Scanner;
public class _p63SumTerminos1 {
    public static void main(String[] args) {
        int a;
        double sum;
        char res;

        Scanner Dato = new Scanner(System.in);

        do{


            sum = 0;

            System.out.println("¿Cuantos terminos introducirás?"); int Cant = Dato.nextInt();

            //Procedimiento
            for(a=1; a<=(Cant-1); a++){
                System.out.printf("1/%d + ", a);
                sum += 1.0 / a;
            }
            sum += 1.0 /a;

            System.out.printf("1/%d\nLa suma de los términos es: %.6f", Cant, sum);

            //Damos la opcion al usuario de reiniciar el programa.
            System.out.println("\n¿Desea reiniciar el programa? (S/N) "); res = Character.toUpperCase(Dato.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n There once was a Cat and the cat was me");
        Dato.close();
    }
}