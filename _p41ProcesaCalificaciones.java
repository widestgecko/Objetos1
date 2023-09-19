//Antonio Rubén Martínez Villegas
//Numeros100a1
//Actividad 7
//19/09/2023
import java.util.Scanner;
public class _p41ProcesaCalificaciones {
    public static void main(String[] args) {
        //variable
        float ficaciones,suma, promedio;

        //Scanner de datos
        Scanner DatoIng = new Scanner(System.in);

        //Asignacion de valor en variables
        ficaciones=suma=promedio=0;


        System.out.print("\033[H\033[2J");System.out.flush();


        System.out.println("Presione ENTER para continuar."); DatoIng.nextLine();
        System.out.print("Aquí podrás procesar las calificaciones");
        System.out.print("Ingrese la cantidad de calificaciones que desea procesar: "); int n = DatoIng.nextInt();
        int c = 1;
        
        //Sumamos las calificaciones
        while( c <= n ) {
            System.out.printf("Ingrese la calificacion no.%d ",c++);
            ficaciones = DatoIng.nextFloat();
            suma += ficaciones;
        }
        promedio = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", promedio);
        DatoIng.close();
    }
}