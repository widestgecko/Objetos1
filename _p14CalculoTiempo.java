//Antonio Rubén Martínez Villegas
//Equivalencia temporal
//Practica 1 
//25/08/2023
import java.util.Scanner;
public class _p14CalculoTiempo {
    public static void main(String[] args) {
    //Variables
    float dias, minutos, segundos, horas;
        
    //Interacción con el usuario
    Scanner DatoUsuario = new Scanner(System.in);

    //Datos del usuario
    System.out.println("Bien, hagamos una equivalencia temporal");
        System.out.println("¿Cuantas horas transcurrirán?: "); horas = DatoUsuario.nextFloat();

    
    //Limpiamos la consola
    System.out.print("\033[H\033[2J"); System.out.flush();
        

    //Proceso
    dias = horas/24;
    minutos = horas*60;
    segundos = horas*(60*60);
    //Respuesta
    System.out.printf("Si han pasado %.2f horas serán:\nDías: %.2f.\nMinutos: %.2f.\nSegundos: %.2f.", horas, dias, minutos, segundos);
    DatoUsuario.close();
    } 
}

