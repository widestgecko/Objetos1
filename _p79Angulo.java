//Antonio Rubén Martínez Villegas
//Ángulos perrones
//Practica 5
//21/09/2023
import java.util.Scanner;

public class _p79Angulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un ángulo entre 0 y 360 grados, bro: ");
        int angulo = scanner.nextInt();
        
        if (angulo >= 0 && angulo <= 360) {
            String tipo;
            
            if (angulo < 90) {
                tipo = "agudo";
            } else if (angulo == 90) {
                tipo = "recto";
            } else if (angulo > 90 && angulo < 180) {
                tipo = "obtuso";
            } else if (angulo == 180) {
                tipo = "llano";
            } else if (angulo > 180 && angulo < 360) {
                tipo = "cóncavo";
            } else {
                tipo = "No digas mamads, meriyein";
            }
            
            System.out.println("El ángulo de " + angulo + " grados es " + tipo + ".");
        } else {
            System.out.println("No digas mamadas meriyein");
        }
        
        scanner.close();
    }
}