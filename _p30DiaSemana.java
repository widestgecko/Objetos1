//Antonio Rubén Martínez Villegas
//Semana
//Actividad 6
//31/08/2023
import java.util.Scanner;
public class _p30DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un numero entre 1 y 7 imprime el dia de la semana\n");
        System.out.print("Dame el día con número? ");
        //Interacción con el usuario
        int dia = new Scanner(System.in).nextInt();
        switch (dia) {
            //Determinamos el día en base a la respuessta del usuario
            case 1 : System.out.println("Lunes");break;
            case 2 : System.out.println("Martes");break;
            case 3 : System.out.println("Miércoles");break;
            case 4 : System.out.println("Jueves");break;
            case 5 : System.out.println("Viernes");break;
            case 6 : System.out.println("Sábado");break;
            case 7 : System.out.println("Domingo");break;
            default : System.out.println("Día inválido, en que día vives !!!");break;
        }
        System.out.println("\n\nProceso terminado ...");
    }
}