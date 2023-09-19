//Antonio Rubén Martínez Villegas
//Calculaddora del volumen de un cilindro
//Practica 1 
//25/08/2023
import java.util.Scanner;
public class _p13VolumenCilindro {
    public static void main(String[] args) {
        //Variables
        float radio, Altura;
        double Volumen;

        //Interacción con el usuario
        Scanner DataUs = new Scanner(System.in);
        //Entrada
        System.out.println("¿Quieres calcular el volumen de un Cilindro?");
        System.out.println("__Presiona Enter__");
        DataUs.nextLine();
        
        //Caracteristicas del cilindro
        System.out.println("¿Que radio tiene el cilindro?: "); radio = DataUs.nextFloat();
        System.out.println("¿Y su altura?: "); Altura = DataUs.nextFloat();
        //Proceso de calculo
        Volumen = ((Math.PI) * (radio*radio)) * Altura;

        //Limpiamos la consola
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        //Resultado
        System.out.printf("El volumen del cilindro es %.2f",Volumen);
        DataUs.close();
    }

}