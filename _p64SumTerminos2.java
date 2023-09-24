//Antonio Rubén Martínez Villegas
//Terminos2
//Práctica 4
//19/09/2023
import java.util.Scanner;
public class _p64SumTerminos2 {
    public static void main(String[] args) {

        char res;
        int a, sum, term;

        Scanner DatoIng = new Scanner(System.in);

        do{

            sum = 0;
            term = 1;

            System.out.println("Cuantos terminos quieres leer? "); int CantNum = DatoIng.nextInt();

            for(a=1; a<=(CantNum-1); a++){
                System.out.printf("%d + ", term);
                sum += term;
                term = (term*10) +1;
            }
            sum += term;
            
            //Resultados.
            System.out.printf("%d\nEl resultado es: %d\n",term, sum);
            

            System.out.println("¿Desea reiniciar el programa? (S/N) "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n Tremendisimo programa nos acabamos de mercar, eh?");
        DatoIng.close();
    }
}