//Antonio Rubén Martínez Villegas
//Conteo de numeros
//Actividad 7
//19/09/2023
import java.util.Scanner;
    public class _p43ConteoNumeros {
    public static void main(String[] args) {
        //Variables
        int Ingresado,Num,suma,CanNPos,CanNeg,ceros;

        //Creamos una entrada de datos.
        Scanner DatoIng = new Scanner(System.in);

        //Asignamos valores a las variables.
        Num=suma=CanNPos=CanNeg=ceros=0;

        System.out.print("\033[H\033[2J");System.out.flush();

        //Obtenemos los datos.
        System.out.println("Preióne ENTER para continuar."); DatoIng.nextLine();

        do {
            System.out.print("Ingrese un numero: "); Ingresado = DatoIng.nextInt();
            if( Ingresado != 999) {
            Num++;
            suma += Ingresado;
            if(Ingresado>0) CanNPos++;
            else if(Ingresado<0) CanNeg++;
            else ceros++;
            }
        } while(Ingresado!=999);

        //Mostramos los resultados en pantalla.
        System.out.println("\nCaptura terminada");
        System.out.println("\nResumen:");
        System.out.printf("Introdujiste %d numeros \n",Num);
        System.out.printf("La suma de los numeros es : %d \n",suma);
        System.out.printf("Los positivos fueron : %d \n", CanNPos);
        System.out.printf("Los negativos fueron : %d \n", CanNeg);
        System.out.printf("Los ceros fueron : %d \n", ceros);
        System.out.println("\nProceso terminado ...");
        DatoIng.close();
    }
}