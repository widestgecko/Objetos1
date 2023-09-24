//Antonio Rubén Martínez Villegas
//Fibonacci
//Práctica 3
//23/09/2023

import java.util.Scanner;
public class _p51SerieFibonaci {
    public static void main(String[] args) {
        //variables.
        int contador, Lim, F1, F2, Fn3;
        char res;


        Scanner DatoIng = new Scanner(System.in);

        do{
            //Establecemos variables.
            F1 = 0;
            F2 = 1;
            contador = 3;

            System.out.print("\033[H\033[2J");System.out.flush();

            //Obtenemos datos.
            System.out.println("Ingrese el valor máximo: "); Lim = DatoIng.nextInt();
            System.out.print("La sucesión es: \n0  1 ");

            //Establacemos el proceso a seguir.
            do{
                Fn3 = F1 + F2;
                System.out.printf(" %d ", Fn3);
                F1 = F2;
                F2 = Fn3;
                contador++;
            }while(contador<=Lim);
            
            //Damos la opcion al usuario de reiniciar el programa.
        System.out.println("\n¿Desea reiniciar el programa? (S/N)."); res = Character.toUpperCase(DatoIng.next().charAt(0));
        }while(res != 'N');
        System.out.print("\n Hasta la próxima, máquina");
        DatoIng.close();
    }
}