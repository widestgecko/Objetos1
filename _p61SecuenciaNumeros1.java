//Antonio Rubén Martínez Villegas
//Secuencia de numeros
//Práctica 4
//19/09/2023
import java.util.Scanner;

public class _p61SecuenciaNumeros1 {
    public static void main(String[] args) {

        int i, j;
        char res;


        Scanner DatoIng = new Scanner(System.in);

        do{

            System.out.println("Ingrese el numero de renglones a usar: "); int canReg = DatoIng.nextInt();

            //Establecesmos el proceso a seguir.
            for(i = 1; i <= canReg; i++ ){
                for(j =1; j<=i; j++){
                    System.out.printf("%d ", i);
                }
                System.out.println("\n");
            }

            //Damos al usuario la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N)? "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n Teengo un ###### de hambre");
        DatoIng.close();
    }    
}