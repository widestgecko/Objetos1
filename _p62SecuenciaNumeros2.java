//Antonio Rubén Martínez Villegas
//Secuencia de numeros2
//Práctica 4
//19/09/2023
import java.util.Scanner;

public class _p62SecuenciaNumeros2 {
    public static void main(String[] args) {

        int a, b;
        char res;

        //Creamos una entrda de datos.
        Scanner DatoIng = new Scanner(System.in);

        do{



            System.out.println("Ingrese el numero de renglones a usar: "); int canReg = DatoIng.nextInt();

            //Procedimiento
            for(a = 1; a <= canReg; a++ ){
                for(b = 1; b <= a; b++){
                    System.out.printf("%d ", b);
                }
                System.out.println("\n");
            }

            //Damos al usuario la opcion de reiniciar el programa.
            System.out.print("\nDeseas continuar (S/N)? "); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.println("\n Hasta la próxima, bro");
        DatoIng.close();
    }    
}