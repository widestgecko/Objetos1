//Antonio Rubén Martínez Villegas
//Convertidor monetario
//Practica 1 
//25/08/2023
import java.util.Scanner;
public class _p15ConvertirADolares {
    public static void main(String[] args) {

        //Variables
         double pesos, dolares;
        
         Scanner DataUs = new Scanner(System.in);

        //Interacción del usuario
        System.out.println("Conversór de Pesos a Dolares");
        System.out.println("__Presiona Enter__");
        DataUs.nextLine();
        System.out.println("¿Cuantos pesos tienes? "); pesos = DataUs.nextFloat();
        
        //Conversión
        dolares = pesos/16.75;

        //Respuesta
        System.out.printf("La cantidad de %.2f pesos mexicanos equivale a %.2f dolares estadounidenses.", pesos, dolares);
        DataUs.close();
    }
}
    
