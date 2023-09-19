//Antonio Rubén Martínez Villegas
//Conversor de temperaturas
//Practica 1 
//25/08/2023
import java.util.Scanner;
public class _p12ConvertirTemperatura {
    public static void main(String[] args) {
        //Variables
        double cel, fa;
       
        //Interacción con el usuario
        Scanner DataUsuario = new Scanner(System.in);
        System.out.println("¿Quieres convertir Grados Fahrenheit a Grados Celsius?");
        System.out.println("__Presiona Enter__");
        DataUsuario.nextLine();
       
        //El usuario dirá la medida
        System.out.println("¿Cuántos grados Celsius tienes?"); 
        fa = DataUsuario.nextDouble();

        //Limpiamos la consola
        System.out.print("\033[H\033[2J"); System.out.flush();
       
        //Se hace la conversión
        cel = (fa - 32)/1.8;

        System.out.printf("La temperatura de %.2f grados Fahrenheit es equivalente a %.2f grados Celsius.", fa, cel);
        DataUsuario.close();
    }
}


