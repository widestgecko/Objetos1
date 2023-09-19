//Antonio Rubén Martínez Villegas
//Calcular ángulos
//Practica 1 
//25/08/2023
import java.util.Scanner;
public class _p11CalcularAngulo {
    public static void main(String[] args) {
        //Variables
        Double angulo1, angulo2, angulo3;

        //Entrada de usuario
        Scanner Datousuario = new Scanner(System.in);
        System.out.println("Calculemos el ángulo de un triangulo");
        System.out.println("__Presiona Enter__");
        Datousuario.nextLine();
        System.out.println("Digite el primer angulo: "); angulo1 = Datousuario.nextDouble();
        System.out.println("Digite el segundo angulo: "); angulo2 = Datousuario.nextDouble();

        //Limpiamos la consola
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        angulo3 = 180-(angulo1+angulo2);
        System.out.printf("El Tercer angulo mide: %.2f",angulo3);
        Datousuario.close();
    }
}
