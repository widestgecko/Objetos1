//Antonio Rubén Martínez Villegas
//Angulos 2
//Actividad 5
//31/08/2023
import java.util.Scanner;
public class _p26TipoDeAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra el tipo de ángulo \n");

        //Interacción con el usuario
        System.out.print("Dame un ángulo entre 0 y 360 grados? ");
        int angulo = new Scanner(System.in).nextInt();
        System.out.print("El ángulo que introdujiste: ");
       
        //Evaluación de la respuesta
     
        if(angulo<90)

            System.out.println("Es agudo");

        if(angulo==90)

            System.out.println("Es recto");

        if(angulo>90 && angulo<180)

            System.out.println("Es obtuso");

        if(angulo==180)

            System.out.println("Es llano");

        if(angulo>180 && angulo<360)

            System.out.println("Es concavo");

        if(angulo==360)
            System.out.println("Es completo");
            System.out.println("\nProceso terminado ....");
    }
}